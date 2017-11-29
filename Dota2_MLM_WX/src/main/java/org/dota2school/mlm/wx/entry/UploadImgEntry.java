package org.dota2school.mlm.wx.entry;

import org.dota2school.mlm.common.model.SuccessEntry;

public class UploadImgEntry  extends SuccessEntry{

    private String path;

    public UploadImgEntry(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
