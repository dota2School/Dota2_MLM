package org.dota2school.mlm.wx.service;

import org.dota2school.mlm.common.domain.TeacherCount;
import org.dota2school.mlm.common.model.Entry;
import org.dota2school.mlm.common.respository.TeacherCountRespository;
import org.dota2school.mlm.wx.entry.TeacherCountEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MlmWxCountService {

    @Autowired
    private TeacherCountRespository teacherCountRespository;


    public Entry teacher(String session){
        TeacherCount teacherCount = teacherCountRespository.findOne(session);
        return new TeacherCountEntry(teacherCount);
    }

}
