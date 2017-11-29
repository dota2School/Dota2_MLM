package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.common.model.Entry;
import org.dota2school.mlm.wx.service.MlmWxClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 打卡记录的controller
 * @author Xuxue1 2017-11-26
 */
@RestController
@RequestMapping("/api/mlm/wx/clock")
public class MlmWxClockController {

    @Autowired
    private MlmWxClockService mlmWxClockService;

    /**
     *
     * @param session
     * @param classType
     * @param students
     * @param teachTime
     * @param teachDate
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Entry addClock(
            String session,
            String classType,
            String students,
            String teachTime,
            String teachDate){
        return mlmWxClockService.createClock(session,classType,students,teachTime,teachDate);
    }

    /**
     *
     * @param session
     * @param signId
     * @return
     */
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Entry getClock(
            String session,
            String signId){
        return mlmWxClockService.queryDetailClock(session,signId);
    }

    /**
     *
     * @param session
     * @return
     */
    public Entry getUserResponseClock(String session){
         return mlmWxClockService.getUserResponseClock(session);
    }

    /**
     *
     * @param session
     * @param iv
     * @param code
     * @param encryptedData
     * @param signId
     * @param status
     * @param evaluate
     * @param pictrues
     * @return
     */
    @RequestMapping(value = "/response",method = RequestMethod.POST)
    public Entry responseClock(
            String session,
            String iv,
            String code,
            String encryptedData,
            String signId,
            String status,
            String evaluate,
            String pictrues){
        return mlmWxClockService.responseClock(session,iv,code,encryptedData,signId,status,evaluate,pictrues);
    }
}
