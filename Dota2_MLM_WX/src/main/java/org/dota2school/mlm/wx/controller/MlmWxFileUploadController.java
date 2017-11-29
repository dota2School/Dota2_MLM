package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.service.MlmWxFileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@RequestMapping("/api/mlm/wx/file")
public class MlmWxFileUploadController {

    @Autowired
    private MlmWxFileUploadService mlmWxFileUploadService;

    @RequestMapping(value = "/upload_img",method = RequestMethod.POST)
    public Entry imgUpload(MultipartHttpServletRequest multiReq){
        return mlmWxFileUploadService.uploadImg(multiReq);
    }

}
