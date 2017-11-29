package org.dota2school.mlm.wx.util;


import com.google.gson.Gson;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Security;
import java.util.Base64;
import java.util.HashMap;


/**
 *
 * @author xujq
 * @time 2017-7-10
 */
public class AES {
    public static final Gson G = new Gson();
    private String appId;
    private String sessionKey;
    private static boolean initialized = false;
    public AES(String sessionKey){
        this.sessionKey=sessionKey;
    }
    public HashMap decryptData(String content,String iv) throws Exception {
        byte[] keyByte= Base64.getDecoder().decode(sessionKey);
        byte[] ivByte= Base64.getDecoder().decode(iv);
        byte[] contByte= Base64.getDecoder().decode(content);
        initialize();
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            Key sKeySpec = new SecretKeySpec(keyByte, "AES");
            cipher.init(Cipher.DECRYPT_MODE, sKeySpec, generateIV(ivByte));// 初始化
            byte[] result = cipher.doFinal(contByte);

            String userInfo = new String(result);
            return G.fromJson(userInfo,HashMap.class);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void initialize(){
        if (initialized) return;
        Security.addProvider(new BouncyCastleProvider());
        initialized = true;
    }
    public static AlgorithmParameters generateIV(byte[] iv) throws Exception{
        AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
        params.init(new IvParameterSpec(iv));
        return params;
    }
}
