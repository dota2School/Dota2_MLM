package org.dota2school.mlm.wx.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by nt on 2017/7/29.
 */
@Embeddable
public class AllSignId implements Serializable{

    @Column(name="sign_id")
    private int signId;

    @Column(name="s_open_id")
    private String sOpenId;


    public int getSignId() {
        return signId;
    }

    public void setSignId(int signId) {
        this.signId = signId;
    }

    public String getsOpenId() {
        return sOpenId;
    }

    public void setsOpenId(String sOpenId) {
        this.sOpenId = sOpenId;
    }
}
