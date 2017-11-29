package org.dota2school.mlm.wx.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

/**
 *
 * @author xujq
 * @time 2017-7-29
 */
@IdClass(AllSignId.class)
@Entity(name="view_all")
public class AllSign {

    @Id
    @Column(name="sign_id")
    private int signId;

    @Id
    @Column(name="s_open_id")
    private String sOpenId;

    @Column(name="t_open_id")
    private String tOpenId;

    @Column(name="t_teach_time")
    private String tTeachTime;

    @Column(name="t_teach_date")
    private Date tTeachDate;

    @Column(name="t_updatetime")
    private Date tUpdateTime;

    @Column(name="t_teach_time_int")
    private int tTeachTimeInt;

    @Column(name="t_avatar_url")
    private String tAvatarUrl;

    @Column(name="t_nick_name")
    private String tNickName;

    @Column(name="t_nick_name_p")
    private String tNickNameP;

    @Column(name="t_type")
    private int tType;

    @Column(name="t_grede")
    private int tGrede;

    @Column(name="t_class_type")
    private String tClassType;

    @Column(name="t_stream_id")
    private String tStreamId;

    @Column(name="t_motton")
    private String tMotton;

    @Column(name="t_rank_score")
    private String tRankScore;

    @Column(name="t_class_content")
    private String tClassContent;

    @Column(name="s_status")
    private String sStatus;

    @Column(name="s_evaluate")
    private String sEvaluate;

    @Column(name="s_updatetime")
    private Date sUpdatetime;

    @Column(name="s_avatar_url")
    private String sAvatarUrl;

    @Column(name="s_nick_name")
    private String sNickName;

    @Column(name="s_type")
    private int sType;

    @Column(name="s_grede")
    private int sGrede;


    @Column(name="s_stream_id")
    private String sStreamId;

    @Column(name = "s_motton")
    private String sMotton;

    @Column(name="s_rank_score")
    private String sRankScore;

    @Column(name="s_class_content")
    private String sClassContent;

    @Column(name="s_class_type")
    private String sClassType;

    @Column(name="s_nick_name_p")
    private String sNickNameP;


    public int getSignId() {
        return signId;
    }

    public void setSignId(int signId) {
        this.signId = signId;
    }

    public String gettOpenId() {
        return tOpenId;
    }

    public void settOpenId(String tOpenId) {
        this.tOpenId = tOpenId;
    }

    public String gettTeachTime() {
        return tTeachTime;
    }

    public void settTeachTime(String tTeachTime) {
        this.tTeachTime = tTeachTime;
    }

    public Date gettTeachDate() {
        return tTeachDate;
    }

    public void settTeachDate(Date tTeachDate) {
        this.tTeachDate = tTeachDate;
    }

    public Date gettUpdateTime() {
        return tUpdateTime;
    }

    public void settUpdateTime(Date tUpdateTime) {
        this.tUpdateTime = tUpdateTime;
    }

    public int gettTeachTimeInt() {
        return tTeachTimeInt;
    }

    public void settTeachTimeInt(int tTeachTimeInt) {
        this.tTeachTimeInt = tTeachTimeInt;
    }

    public String gettAvatarUrl() {
        return tAvatarUrl;
    }

    public void settAvatarUrl(String tAvatarUrl) {
        this.tAvatarUrl = tAvatarUrl;
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

    public int gettType() {
        return tType;
    }

    public void settType(int tType) {
        this.tType = tType;
    }

    public int gettGrede() {
        return tGrede;
    }

    public void settGrede(int tGrede) {
        this.tGrede = tGrede;
    }

    public String gettClassType() {
        return tClassType;
    }

    public void settClassType(String tClassType) {
        this.tClassType = tClassType;
    }

    public String gettStreamId() {
        return tStreamId;
    }

    public void settStreamId(String tStreamId) {
        this.tStreamId = tStreamId;
    }

    public String gettMotton() {
        return tMotton;
    }

    public void settMotton(String tMotton) {
        this.tMotton = tMotton;
    }

    public String gettRankScore() {
        return tRankScore;
    }

    public void settRankScore(String tRankScore) {
        this.tRankScore = tRankScore;
    }

    public String gettClassContent() {
        return tClassContent;
    }

    public void settClassContent(String tClassContent) {
        this.tClassContent = tClassContent;
    }

    public String getsOpenId() {
        return sOpenId;
    }

    public void setsOpenId(String sOpenId) {
        this.sOpenId = sOpenId;
    }

    public String getsStatus() {
        return sStatus;
    }

    public void setsStatus(String sStatus) {
        this.sStatus = sStatus;
    }

    public String getsEvaluate() {
        return sEvaluate;
    }

    public void setsEvaluate(String sEvaluate) {
        this.sEvaluate = sEvaluate;
    }

    public Date getsUpdatetime() {
        return sUpdatetime;
    }

    public void setsUpdatetime(Date sUpdatetime) {
        this.sUpdatetime = sUpdatetime;
    }

    public String getsAvatarUrl() {
        return sAvatarUrl;
    }

    public void setsAvatarUrl(String sAvatarUrl) {
        this.sAvatarUrl = sAvatarUrl;
    }

    public String getsNickName() {
        return sNickName;
    }

    public void setsNickName(String sNickName) {
        this.sNickName = sNickName;
    }

    public int getsType() {
        return sType;
    }

    public void setsType(int sType) {
        this.sType = sType;
    }

    public int getsGrede() {
        return sGrede;
    }

    public void setsGrede(int sGrede) {
        this.sGrede = sGrede;
    }

    public String getsStreamId() {
        return sStreamId;
    }

    public void setsStreamId(String sStreamId) {
        this.sStreamId = sStreamId;
    }

    public String getsMotton() {
        return sMotton;
    }

    public void setsMotton(String sMotton) {
        this.sMotton = sMotton;
    }

    public String getsRankScore() {
        return sRankScore;
    }

    public void setsRankScore(String sRankScore) {
        this.sRankScore = sRankScore;
    }

    public String getsClassContent() {
        return sClassContent;
    }

    public void setsClassContent(String sClassContent) {
        this.sClassContent = sClassContent;
    }

    public String getsClassType() {
        return sClassType;
    }

    public void setsClassType(String sClassType) {
        this.sClassType = sClassType;
    }

    public String getsNickNameP() {
        return sNickNameP;
    }

    public void setsNickNameP(String sNickNameP) {
        this.sNickNameP = sNickNameP;
    }

    @Override
    public String toString() {
        return "AllSign{" +
                "signId=" + signId +
                ", sOpenId='" + sOpenId + '\'' +
                ", tOpenId='" + tOpenId + '\'' +
                ", tTeachTime='" + tTeachTime + '\'' +
                ", tTeachDate=" + tTeachDate +
                ", tUpdateTime=" + tUpdateTime +
                ", tTeachTimeInt=" + tTeachTimeInt +
                ", tAvatarUrl='" + tAvatarUrl + '\'' +
                ", tNickName='" + tNickName + '\'' +
                ", tNickNameP='" + tNickNameP + '\'' +
                ", tType=" + tType +
                ", tGrede=" + tGrede +
                ", tClassType='" + tClassType + '\'' +
                ", tStreamId='" + tStreamId + '\'' +
                ", tMotton='" + tMotton + '\'' +
                ", tRankScore='" + tRankScore + '\'' +
                ", tClassContent='" + tClassContent + '\'' +
                ", sStatus='" + sStatus + '\'' +
                ", sEvaluate='" + sEvaluate + '\'' +
                ", sUpdatetime=" + sUpdatetime +
                ", sAvatarUrl='" + sAvatarUrl + '\'' +
                ", sNickName='" + sNickName + '\'' +
                ", sType=" + sType +
                ", sGrede=" + sGrede +
                ", sStreamId='" + sStreamId + '\'' +
                ", sMotton='" + sMotton + '\'' +
                ", sRankScore='" + sRankScore + '\'' +
                ", sClassContent='" + sClassContent + '\'' +
                ", sClassType='" + sClassType + '\'' +
                ", sNickNameP='" + sNickNameP + '\'' +
                '}';
    }
}
