package org.dota2school.mlm.wx.service;


import org.dota2school.mlm.wx.domain.User;
import org.dota2school.mlm.wx.exception.MLMException;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.model.SessionKey;
import org.dota2school.mlm.wx.repository.UserRepository;
import org.dota2school.mlm.wx.util.AES;
import org.dota2school.mlm.wx.util.RequestSessionKey;
import org.dota2school.mlm.wx.WxConfig;
import org.dota2school.mlm.wx.entry.UserEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Service
public class MlmWxUserService {
    private static final Logger LOG = LoggerFactory.getLogger(MlmWxUserService.class);

    @Autowired
    private WxConfig wxConfig;

    @Autowired
    private UserRepository userRepository;

    private RequestSessionKey requestSessionKey;



    @PostConstruct
    public void init(){
        requestSessionKey = new RequestSessionKey(
                wxConfig.getSecret(),
                wxConfig.getId());
    }

    public Entry query(String iv,
                       String code,
                       String encryptedData){
        try{
            SessionKey sessionKey = requestSessionKey.request(code);
            return query(sessionKey.getOpenid());
        }catch (Exception ex){
            throw new MLMException(ex,1);
        }
    }

    public Entry query(String openId){
        return new UserEntry(userRepository.findOne(openId));
    }

    public Entry modify(String session,
                        String roleType,
                        String nickName,
                        String classType,
                        String steamID,
                        String rankScore,
                        String contents,
                        String className){
        try{
            User user = userRepository.findOne(session);
            if(roleType!=null && !roleType.isEmpty()){
                user.setRoleType(Integer.parseInt(roleType));
            }
            if(nickName!=null && !nickName.isEmpty()){
                user.setNickName(nickName);
            }

            if(classType!=null && !classType.isEmpty()){
                user.setClassType(classType);
            }
            if(steamID!=null && !steamID.isEmpty()){
                user.setStreamId(steamID);
            }

            if(rankScore!=null && !rankScore.isEmpty()){
                user.setRankScore(rankScore);
            }

            if(contents!=null && !contents.isEmpty()){
                user.setContents(contents);
            }

            if(className!=null && !className.isEmpty()){
                user.setClassName(className);
            }
            userRepository.save(user);
            return new UserEntry(user);
        }catch (Exception ex){
            throw new MLMException(ex,2);
        }
    }

    public Entry addUser(String iv,
                         String code,
                         String encryptedData){
        try{
            SessionKey sessionKey = requestSessionKey.request(code);
            AES aes = new AES(sessionKey.getSession_key());
            HashMap data = aes.decryptData(encryptedData,iv);
            LOG.info("Add user {}",data);
            User user = userRepository.findOne(sessionKey.getOpenid());
            if(user == null){
                user = new User();
                user.setOpenId(sessionKey.getOpenid());
                LOG.info("User {} not exist!",sessionKey.getOpenid());
            }
            user.setAvatarUrl(data.get("avatarUrl").toString());
            user.setNickNameP(data.get("nickName").toString());
            user.setCountry(data.get("country").toString());
            user.setGender(data.get("gender").toString());
            user.setProvince(data.get("province").toString());
            user.setCity(data.get("city").toString());
            user.setAvatarUrl(data.get("avatarUrl").toString());
            userRepository.save(user);
            LOG.info("Success add user!");
            return new UserEntry(user);
        }catch (Exception ex){
            throw new MLMException(ex,1);
        }
    }

}
