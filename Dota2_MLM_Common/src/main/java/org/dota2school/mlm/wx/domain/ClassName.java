package org.dota2school.mlm.wx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 班级名称
 * @author Xuxue1
 */
@Entity(name = "class_name")
public class ClassName {

    /**
     * 班级名称
     */
    @Id
    @Column(name="name")
    private String className;

    /**
     * 跟新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 排序
     */
    @Column(name = "orders")
    private int order;

    /**
     * 萌新班还是提高班
     */
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
