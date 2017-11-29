package org.dota2school.mlm.wx.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.dota2school.mlm.wx.exception.MLMException;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.WxConfig;
import org.dota2school.mlm.wx.entry.UploadImgEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class MlmWxFileUploadService {
    private static final Logger LOG = LoggerFactory.getLogger(MlmWxFileUploadService.class);

    @Autowired
    private WxConfig wxConfig;


    public Entry uploadImg(MultipartHttpServletRequest multiReq){
        String session = multiReq.getParameter("session");
        if(session == null) session = "0";
        String uploadFilePath = multiReq.getFile("filePath").getOriginalFilename();
        String uploadFileName = uploadFilePath.substring(
                uploadFilePath.lastIndexOf('\\') + 1, uploadFilePath.indexOf('.'));
        String uploadFileSuffix = uploadFilePath.substring(
                uploadFilePath.indexOf('.') + 1, uploadFilePath.length());
        System.out.println("uploadFileSuffix:" + uploadFileSuffix);
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = (FileInputStream) multiReq.getFile("filePath").getInputStream();
            String fileName = DigestUtils.md5Hex(uploadFileName + "."+ uploadFileSuffix+System.currentTimeMillis());
            File file  = new File(wxConfig.getPath()+"/"+session + "/"+fileName+"."+uploadFileSuffix);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            fos = new FileOutputStream(file);
            byte[] temp = new byte[1024];
            int i = fis.read(temp);
            while (i != -1){
                fos.write(temp,0,temp.length);
                fos.flush();
                i = fis.read(temp);
            }
            return new UploadImgEntry("/"+session + "/"+fileName+"."+uploadFileSuffix);
        } catch (IOException e) {
            LOG.info("Failed write file",e);
            throw new MLMException(0);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
