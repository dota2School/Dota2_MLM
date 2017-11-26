package org.dota2school.mlm.wx.controller;


import org.dota2school.mlm.common.model.Entry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取班级的名称
 * @author Xuxue1 2017-11-26
 */
@RestController
@RequestMapping("/api/mlm/wx/class_name")
public class MlmWxClassNameController {

    /**
     * 查询班级名称
     * @return
     */
    @RequestMapping("query")
    public Entry queryClassName(){
        return null;
    }

}
