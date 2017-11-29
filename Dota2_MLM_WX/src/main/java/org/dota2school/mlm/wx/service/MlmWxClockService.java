package org.dota2school.mlm.wx.service;

import javafx.util.Pair;
import org.dota2school.mlm.wx.domain.Clock;
import org.dota2school.mlm.wx.domain.SignStudent;
import org.dota2school.mlm.wx.domain.User;
import org.dota2school.mlm.wx.exception.MLMException;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.model.SessionKey;
import org.dota2school.mlm.wx.model.SuccessEntry;
import org.dota2school.mlm.wx.repository.SignRepository;
import org.dota2school.mlm.wx.repository.SignStudentRepository;
import org.dota2school.mlm.wx.repository.UserRepository;
import org.dota2school.mlm.wx.util.RequestSessionKey;
import org.dota2school.mlm.wx.WxConfig;
import org.dota2school.mlm.wx.entry.ClockDetailEntry;
import org.dota2school.mlm.wx.entry.ClockEntry;
import org.dota2school.mlm.wx.entry.ResponseClockEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MlmWxClockService {

    @Autowired
    private SignRepository signRepository;

    @Autowired
    private SignStudentRepository signStudentRepository;

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

    private static final ThreadLocal<DateFormat> format = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));



    public Entry createClock(String session,
                             String classType,
                             String students,
                             String teachTime,
                             String teachDate){
        try {
            Clock clock = new Clock();
            clock.setOpenId(session);
            clock.setTeachDate(format.get().parse(teachDate));
            clock.setTeachTime(teachTime);
            clock.setUpdateTime(new Date());
            clock.setClassType(classType);
            try{
                clock.setTeachTimeInt(Double.parseDouble(teachTime
                        .replace("半","0.5")
                        .replace("小时","")));
            }catch (Exception ex){
                clock.setTeachTimeInt(0);
            }
            clock = signRepository.save(clock);
            return new ClockEntry(clock);
        }catch (Exception ex){
            throw new MLMException(ex);
        }
    }

    @SuppressWarnings("unchecked")
    public Entry queryDetailClock(String session,String signId){
        List<SignStudent> students = signStudentRepository.findBySign(Integer.parseInt(signId));
        Clock clock = signRepository.findOne(Integer.parseInt(signId));
        List<Pair<User,SignStudent>> users = students
                    .stream()
                    .map(student->new Pair<User,SignStudent>(userRepository.findOne(student.getOpenId()),student))
                    .collect(Collectors.toList());
        return new ClockDetailEntry(clock,users);
    }

    public Entry getUserResponseClock(String session){
        List<SignStudent> students = signStudentRepository.findByOpenId(session);
        if(students.size()!=0){
            return new ResponseClockEntry(students.get(0));
        }
        throw new MLMException(0);
    }

    public Entry responseClock(String session,
                               String iv,
                               String code,
                               String encryptedData,
                               String signId,
                               String status,
                               String evaluate,
                               String pictrues){
        try{
            if(session == null){
                SessionKey requestSessionKeyResponse = requestSessionKey.request(code);
                session = requestSessionKeyResponse.getOpenid();
            }
            SignStudent signStudent = new SignStudent();
            signStudent.setEvaluate(evaluate);
            signStudent.setOpenId(session);
            signStudent.setSignId(Integer.parseInt(signId));
            signStudent.setStatus(status);
            signStudent.setDate(new Date());
            if(pictrues != null){
                signStudent.setPictrues(pictrues);
            }
            signStudentRepository.saveAndFlush(signStudent);
            return new SuccessEntry();
        }catch (Exception ex){
            throw new MLMException(ex);
        }
    }

}
