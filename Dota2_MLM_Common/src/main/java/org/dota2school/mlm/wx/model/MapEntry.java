package org.dota2school.mlm.wx.model;

import java.util.Map;

public class MapEntry extends SuccessEntry {

    private Map<String,Object> data;

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
