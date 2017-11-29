package org.dota2school.mlm.wx.domain;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 老师教学打卡的统计
 * @author Xuxue1
 */
@Entity(name="view_t_count")
public class TeacherCount {

    /**
     * 老师的open_id
     */
    @Id
    @Column(name="open_id")
    private String openId;

    /**
     * 更新时间
     */
    @Column(name="updatetime")
    private Date updateTime;

    /**
     * 老师的班级类型
     */
    @Column(name="t_class_type")
    private String classType;

    /**
     * 老师的昵称
     */
    @Column(name="t_nick_name")
    private String tNickName;

    /**
     * 老师的微信昵称
     */
    @Column(name="t_nick_name_p")
    private String tNickNameP;

    /**
     * 老师的打卡次数
     */
    @Column(name="sign_times")
    private int signTimes;

    /**
     * 老师的打卡时长
     */
    @Column(name="sign_long")
    private double signLong;

    /**
     * 老师的头像
     */
    @Column(name="t_avatar_url")
    private String tAvatarUrl;

    /**
     * 打卡确认次数
     */
    @Column(name="ack_times")
    private int ackTimes;

    /**
     * 打卡详细的信息
     */
    @OneToMany(fetch = FetchType.LAZY,targetEntity = AllSign.class)
    @JoinColumn(name = "t_open_id", referencedColumnName = "open_id", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<AllSign> signData;

    public List<AllSign> getSignData() {
        return signData;
    }

    public void setSignData(List<AllSign> signData) {
        this.signData = signData;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String gettNickName() {
        return tNickName;
    }

    public void settNickName(String tNickName) {
        this.tNickName = tNickName;
    }

    public String gettNickNameP() {
        return tNickNameP;
    }

    public void settNickNameP(String tNickNameP) {
        this.tNickNameP = tNickNameP;
    }

    public int getSignTimes() {
        return signTimes;
    }

    public void setSignTimes(int signTimes) {
        this.signTimes = signTimes;
    }

    public double getSignLong() {
        return signLong;
    }

    public void setSignLong(double signLong) {
        this.signLong = signLong;
    }

    public String gettAvatarUrl() {
        return tAvatarUrl;
    }

    public void settAvatarUrl(String tAvatarUrl) {
        this.tAvatarUrl = tAvatarUrl;
    }

    public int getAckTimes() {
        return ackTimes;
    }

    public void setAckTimes(int ackTimes) {
        this.ackTimes = ackTimes;
    }

    @Override
    public String toString() {
        return "TeacherCount{" +
                "openId='" + openId + '\'' +
                ", updateTime=" + updateTime +
                ", classType='" + classType + '\'' +
                ", tNickName='" + tNickName + '\'' +
                ", tNickNameP='" + tNickNameP + '\'' +
                ", signTimes=" + signTimes +
                ", signLong=" + signLong +
                ", tAvatarUrl='" + tAvatarUrl + '\'' +
                ", ackTimes=" + ackTimes +
                ", signData=" + signData +
                '}';
    }
}
