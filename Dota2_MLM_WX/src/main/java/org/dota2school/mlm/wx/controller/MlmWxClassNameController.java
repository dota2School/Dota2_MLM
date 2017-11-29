package org.dota2school.mlm.wx.controller;


import org.dota2school.mlm.wx.annotation.Tested;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.service.MlmClassNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取班级的名称
 * @author Xuxue1 2017-11-26
 */
@Tested
@RestController
@RequestMapping("/api/mlm/wx/class_name")
public class MlmWxClassNameController {


    @Autowired
    private MlmClassNameService classNameService;

    /**
     * 查询班级名称
     * @return
     */
    @Tested
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Entry queryClassName(){
        return classNameService.queryClassName();
    }

}
