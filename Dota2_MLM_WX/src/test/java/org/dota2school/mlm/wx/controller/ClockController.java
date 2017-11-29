package org.dota2school.mlm.wx.controller;

import org.dota2school.mlm.wx.WxApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WxApplication.class)
public class ClockController {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setUp() {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }


    //{"success":true,"error_code":0,"error_message":null,"punchCard":{"sign_id":5470,"openId":"oUtn60MyXkjGjhLGD1PL-KaaXmqg","teachTime":"","classType":"萌新班","teachDate":1506787200000,"teachTimeInt":0.0,"updateTime":1511927787776}}
    @Test
    public void testAddClock()throws Exception{
        MvcResult result = mvc.perform(post("/api/mlm/wx/clock/add")
                .param("session","oUtn60MyXkjGjhLGD1PL-KaaXmqg")
                .param("classType","萌新班")
                .param("teachTime","")
                .param("teachDate","2017-10-01 00:00:00"))
                .andExpect(status().isOk())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void testResponse()throws Exception{
        MvcResult result = mvc.perform(post("/api/mlm/wx/clock/response")
                .param("session","oUtn60H3zepSIrf-bl-Y21D8W-cE")
                .param("signId","5470")
                .param("status","")
                .param("evaluate","哈哈"))
                .andExpect(status().isOk())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void testQueryDetail()throws Exception{
        MvcResult result = mvc.perform(get("/api/mlm/wx/clock/get_detail")
                .param("session","oUtn60H3zepSIrf-bl-Y21D8W-cE")
                .param("signId","5470"))
                .andExpect(status().isOk())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void testQuery()throws Exception{
        MvcResult result = mvc.perform(get("/api/mlm/wx/clock/get_student")
                .param("session","oUtn60H3zepSIrf-bl-Y21D8W-cE")
                .param("signId","5470"))
                .andExpect(status().isOk())
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

}
