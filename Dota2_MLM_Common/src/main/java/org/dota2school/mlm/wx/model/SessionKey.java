package org.dota2school.mlm.wx.model;

public class SessionKey {

    private String openid;
    private String session_key;

    private String errCode;
    private String errMsg;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getErrcode() {
        return errCode;
    }

    public void setErrcode(String errcode) {
        this.errCode = errcode;
    }

    public String getErrmsg() {
        return errMsg;
    }

    public void setErrmsg(String errmsg) {
        this.errMsg = errmsg;
    }
}
