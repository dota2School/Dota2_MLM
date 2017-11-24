package org.dota2school.mlm.wx;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.dota2school.mlm.common.util.G;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by nt on 2017/11/20.
 */
@Configuration
public class CustomMVCConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        HttpMessageConverter converter=null;
        for(HttpMessageConverter messageConverter:converters){
            if(messageConverter instanceof GsonHttpMessageConverter){
                converter = messageConverter;
            }
        }
        if(converter!=null){
            GsonHttpMessageConverter converter1 = (GsonHttpMessageConverter)converter;
            converter1.setGson(G.gson);
        }

    }
}
