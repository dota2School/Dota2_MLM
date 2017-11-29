package org.dota2school.mlm.wx.model;

import java.util.List;

public class ListEntry  extends SuccessEntry{

    private long total;

    private List<Object> data;


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
