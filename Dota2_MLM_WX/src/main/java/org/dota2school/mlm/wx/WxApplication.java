package org.dota2school.mlm.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

import java.util.TimeZone;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { JacksonAutoConfiguration.class })
public class WxApplication {
    static{
        TimeZone.setDefault(TimeZone.getTimeZone("PRC"));
    }


    public static void main(String[] args){
        SpringApplication.run(WxApplication.class);
    }

}

