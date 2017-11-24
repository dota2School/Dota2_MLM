package org.dota2school.mlm.common.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author xujq
 * @time 2017-7-11
 */
public class G {

    public  static final Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

}
