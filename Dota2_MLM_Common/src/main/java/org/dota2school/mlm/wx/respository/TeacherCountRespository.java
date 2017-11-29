package org.dota2school.mlm.wx.respository;



import org.dota2school.mlm.wx.domain.TeacherCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by nt on 2017/7/29.
 */
public interface TeacherCountRespository extends JpaRepository<TeacherCount,String>,
        JpaSpecificationExecutor<TeacherCount> {

}
