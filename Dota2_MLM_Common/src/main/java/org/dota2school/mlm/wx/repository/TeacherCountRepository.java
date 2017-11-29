package org.dota2school.mlm.wx.repository;



import org.dota2school.mlm.wx.domain.TeacherCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by nt on 2017/7/29.
 */
public interface TeacherCountRepository extends JpaRepository<TeacherCount,String>,
        JpaSpecificationExecutor<TeacherCount> {

}
