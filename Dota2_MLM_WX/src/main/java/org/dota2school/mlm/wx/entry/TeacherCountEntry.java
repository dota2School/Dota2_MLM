package org.dota2school.mlm.wx.entry;

import org.dota2school.mlm.wx.domain.TeacherCount;
import org.dota2school.mlm.wx.model.SuccessEntry;

public class TeacherCountEntry  extends SuccessEntry{

    private double allTeachTimes;

    private int allCard;

    private String leave;

    public TeacherCountEntry(TeacherCount teacherCount){
        this.allTeachTimes = teacherCount.getSignLong();
        this.allCard  = teacherCount.getSignTimes();
        if(teacherCount.getSignTimes()>=0 && teacherCount.getSignTimes()<3){
            leave = "助教";
        }else if(teacherCount.getSignTimes()>=3 && teacherCount.getSignTimes()<10){
            leave = "讲师";
        }else if(teacherCount.getSignTimes() >= 10 && teacherCount.getSignTimes()<50){
            leave="副教授";
        }else{
            leave = "教授";
        }
    }

    public double getAllTeachTimes() {
        return allTeachTimes;
    }

    public void setAllTeachTimes(double allTeachTimes) {
        this.allTeachTimes = allTeachTimes;
    }

    public int getAllCard() {
        return allCard;
    }

    public void setAllCard(int allCard) {
        this.allCard = allCard;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }
}
