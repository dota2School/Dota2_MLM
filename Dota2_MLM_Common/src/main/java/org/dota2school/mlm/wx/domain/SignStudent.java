package org.dota2school.mlm.wx.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * 学生回复打卡
 * @author xujq
 * @time 2017-7-11
 */
@Entity(name = "sign_student")
@Table(name = "sign_student")
@IdClass(SignStudentPK.class)
public class SignStudent {

    /**
     * 打卡id
     */
    @Id
    @Column(name = "sign_id")
    private int signId;

    /**
     * 回复打卡的学生的open_id
     */
    @Id
    @Column(name = "open_id")
    private String openId;

    /**
     * 学生对这次教学是否满意
     */
    @Column(name = "status")
    private String status;

    /**
     * 学生对着次教学的评价
     */
    @Column(name = "evaluate")
    private String evaluate;

    /**
     * 更新时间
     */
    @Column(name = "updatetime")
    private Date date;

    /**
     * 学生评价的图片
     */
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
