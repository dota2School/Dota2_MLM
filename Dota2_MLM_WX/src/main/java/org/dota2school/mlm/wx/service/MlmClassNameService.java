package org.dota2school.mlm.wx.service;

import org.dota2school.mlm.wx.domain.ClassName;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.respository.ClassNameRespository;
import org.dota2school.mlm.wx.entry.ClassNameEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MlmClassNameService {

    @Autowired
    private ClassNameRespository classNameRespository;

    public Entry queryClassName(){
        List<ClassName> classNames =  classNameRespository.findAll(new Sort(new Sort.Order(Sort.Direction.ASC,"order")));
        List<ClassName> mengxin = new ArrayList<>();
        List<ClassName> tigao = new ArrayList<>();
        classNames.forEach(c->{
            if(c.getType().equals("萌新")){
                mengxin.add(c);
            }else {
                tigao.add(c);
            }
        });
        mengxin.sort(Comparator.comparingInt(m->m.getOrder()));
        tigao.sort(Comparator.comparingInt(m ->m.getOrder()));
        ClassNameEntry classNameEntry = new ClassNameEntry();
        classNameEntry.setMengxin(mengxin.stream().map(d->d.getClassName()).collect(Collectors.toList()));
        classNameEntry.setTigao(tigao.stream().map(d->d.getClassName()).collect(Collectors.toList()));
        return classNameEntry;
    }

}
