package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.common.model.Entry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mlm/wx/clock")
public class MlmWxClockController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Entry addClock(){
        return null;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Entry getClock(){

        return null;
    }

    @RequestMapping(value = "/response",method = RequestMethod.POST)
    public Entry responseClock(){

        return null;
    }
}
