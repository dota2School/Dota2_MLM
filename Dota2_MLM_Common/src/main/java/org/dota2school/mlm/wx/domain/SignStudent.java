package org.dota2school.mlm.wx.domain;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author xujq
 * @time 2017-7-11
 */
@Entity(name = "sign_student")
@Table(name = "sign_student")
@IdClass(SignStudentPK.class)
public class SignStudent {

    @Id
    @Column(name = "sign_id")
    private int signId;

    @Id
    @Column(name = "open_id")
    private String openId;

    @Column(name = "status")
    private String status;

    @Column(name = "evaluate")
    private String evaluate;

    @Column(name = "updatetime")
    private Date date;

    @Column(name="pictrues")
    private String pictrues;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSignId() {
        return signId;
    }

    public void setSignId(int signId) {
        this.signId = signId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getPictrues() {
        return pictrues;
    }

    public void setPictrues(String pictrues) {
        this.pictrues = pictrues;
    }
}
