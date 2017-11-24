package org.dota2school.mlm.common.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author xujq
 * @time 2017-7-13
 */
@Embeddable
public class SignStudentPK  implements Serializable{

    @Column(name = "sign_id")
    private int signId;

    @Column(name = "open_id")
    private String openId;

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
}
