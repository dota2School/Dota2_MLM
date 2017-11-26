package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.common.model.Entry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * 统计相关的controller
 * @author Xuxue 2017-11-26
 */
@RestController
@RequestMapping("/api/mlm/wx/count")
public class MlmWxCountController {


    /**
     *
     * 获取老师打卡记录的信息
     * @param session 老师身份的唯一标识(open_id)
     * @return 老师打卡记录的详细信息
     */
    @RequestMapping(value = "/teacher",method = RequestMethod.POST)
    public Entry teacher(String session){
        return null;
    }

}
