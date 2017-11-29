package org.dota2school.mlm.wx.entry;

import org.dota2school.mlm.common.model.SuccessEntry;

import java.util.List;

/**
 * Created by nt on 2017/9/11.
 */
public class ClassNameEntry extends SuccessEntry{

    private List<String> mengxin;

    private List<String> tigao;

    public List<String> getMengxin() {
        return mengxin;
    }

    public void setMengxin(List<String> mengxin) {
        this.mengxin = mengxin;
    }

    public List<String> getTigao() {
        return tigao;
    }

    public void setTigao(List<String> tigao) {
        this.tigao = tigao;
    }
}
