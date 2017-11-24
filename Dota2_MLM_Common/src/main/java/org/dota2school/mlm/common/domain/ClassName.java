package org.dota2school.mlm.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by nt on 2017/9/3.
 */
@Entity(name = "class_name")
public class ClassName {

    @Id
    @Column(name="name")
    private String className;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "orders")
    private int order;

    @Column(name="type")
    private String type;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
