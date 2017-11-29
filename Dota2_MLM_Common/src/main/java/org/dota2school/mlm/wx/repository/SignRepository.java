package org.dota2school.mlm.wx.repository;


import org.dota2school.mlm.wx.domain.Clock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nt on 2017/7/11.
 */
public interface SignRepository extends JpaRepository<Clock,Integer>{

}
