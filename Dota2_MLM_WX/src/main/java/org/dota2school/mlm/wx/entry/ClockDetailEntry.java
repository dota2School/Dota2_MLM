package org.dota2school.mlm.wx.entry;

import javafx.util.Pair;
import org.dota2school.mlm.wx.domain.Clock;
import org.dota2school.mlm.wx.domain.SignStudent;
import org.dota2school.mlm.wx.domain.User;
import org.dota2school.mlm.wx.model.SuccessEntry;

import java.util.List;
import java.util.stream.Collectors;

public class ClockDetailEntry extends SuccessEntry{

    private Clock clock;

    private List<Data> datas;

    public ClockDetailEntry(Clock clock, List<Pair<User,SignStudent>> datas){
        this.clock = clock;
        this.datas = datas.stream()
                .map(data->new Data(data.getValue(),data.getKey()))
                .collect(Collectors.toList());
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }

    private class Data{

        private SignStudent reply;
        private User userInfo;

        public Data(SignStudent reply,User user){
            this.reply = reply;
            this.userInfo = user;
        }

        public SignStudent getReply() {
            return reply;
        }

        public void setReply(SignStudent reply) {
            this.reply = reply;
        }

        public User getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(User userInfo) {
            this.userInfo = userInfo;
        }
    }

}
