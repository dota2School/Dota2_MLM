package org.dota2school.mlm.wx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 用户表
 * @author xujq
 * @time 2017-7-10
 */
@Entity(name = "USER")
public class User {

    /**
     * 用户的open_id 用户的唯一标识
     */
    @Id
    @Column(name = "open_id")
    private String openId;

    /**
     * 用户的头像地址
     */
    @Column(name="avatar_url")
    private String avatarUrl;

    /**
     * 用户的昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户的类型 1是学生 2是老师
     */
    @Column(name="type")
    private int roleType;

    /**
     * 用户的班级
     */
    @Column(name = "grede")
    private int grede;

    /**
     * 用户的steamID
     */
    @Column(name="stream_id")
    private String streamId;

    /**
     * 这个字段暂时没用
     */
    @Column(name = "motton")
    private String motton;

    /**
     * 更新时间
     */
    @Column(name="update_time")
    private Date updateTime;

    /**
     * 天梯分
     */
    @Column(name = "rank_score")
    private String rankScore;

    /**
     * 想学 或者擅长的位置
     */
    @Column(name = "class_content")
    private String contents;

    /**
     * 班级类型 提高班 萌新班
     */
    @Column(name = "class_type")
    private String classType;

    /**
     * 班级的名字
     */
    @Column(name="class_name")
    private String className;

    /**
     * 用户的微信昵称
     */
    @Column(name = "nick_name_p")
    private String nickNameP;

    /**
     * 用户的性别
     */
    @Column(name = "gender")
    private String gender;

    /**
     * 用户的国家
     */
    @Column(name="country")
    private String country;

    /**
     * 用户的省份
     */
    @Column(name="province")
    private String province;

    /**
     * 用户的城市
     */
    @Column(name="city")
    private String city;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickNameP() {
        return nickNameP;
    }

    public void setNickNameP(String nickNameP) {
        this.nickNameP = nickNameP;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getRankScore() {
        return rankScore;
    }

    public void setRankScore(String rankScore) {
        this.rankScore = rankScore;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getGrede() {
        return grede;
    }

    public void setGrede(int grede) {
        this.grede = grede;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getMotton() {
        return motton;
    }

    public void setMotton(String motton) {
        this.motton = motton;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }
}
