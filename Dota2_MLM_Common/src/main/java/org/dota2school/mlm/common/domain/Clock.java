package org.dota2school.mlm.common.domain;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author xujq
 * @time 2017-7-13
 */
@Entity(name = "sign")
public class Clock {

    @Id
    @Column(name = "sign_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sign_id;


    @Column(name="open_id")
    private String openId;

    @Column(name = "teach_time")
    private String teachTime;

    @Column(name="sign_class")
    private String classType;

    @Column(name="teach_date")
    private Date teachDate;

    @Column(name = "teach_time_int")
    private double teachTimeInt;

    @Column(name = "updatetime")
    private Date updateTime;


    public int getSign_id() {
        return sign_id;
    }

    public void setSign_id(int sign_id) {
        this.sign_id = sign_id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(String teachTime) {
        this.teachTime = teachTime;
    }

    public Date getTeachDate() {
        return teachDate;
    }

    public void setTeachDate(Date teachDate) {
        this.teachDate = teachDate;
    }

    public double getTeachTimeInt() {
        return teachTimeInt;
    }

    public void setTeachTimeInt(double teachTimeInt) {
        this.teachTimeInt = teachTimeInt;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
}
