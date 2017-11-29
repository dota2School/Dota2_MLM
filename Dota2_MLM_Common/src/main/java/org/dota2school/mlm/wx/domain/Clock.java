package org.dota2school.mlm.wx.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * 打卡记录
 * @author xujq
 * @time 2017-7-13
 */
@Entity(name = "sign")
public class Clock {

    /**
     * 打卡id 自增主键
     */
    @Id
    @Column(name = "sign_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sign_id;

    /**
     * 创建打卡记录人的open_id
     */
    @Column(name="open_id")
    private String openId;

    /**
     * 打卡的教学时长
     */
    @Column(name = "teach_time")
    private String teachTime;

    /**
     * 打卡的班级
     */
    @Column(name="sign_class")
    private String classType;

    /**
     * 教学的时间
     */
    @Column(name="teach_date")
    private Date teachDate;

    /**
     * 教学时长的数字 单位小时
     */
    @Column(name = "teach_time_int")
    private double teachTimeInt;

    /**
     * 跟新时间
     */
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
