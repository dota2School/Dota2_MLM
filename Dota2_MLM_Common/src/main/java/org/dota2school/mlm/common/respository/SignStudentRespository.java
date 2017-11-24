package org.dota2school.mlm.common.respository;


import org.dota2school.mlm.common.domain.SignStudent;
import org.dota2school.mlm.common.domain.SignStudentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by nt on 2017/7/11.
 */
public interface SignStudentRespository extends JpaRepository<SignStudent,SignStudentPK>{

    @Query("select t from sign_student t where sign_id =?1")
    List<SignStudent> findBySign(int signId);

    @Query(value = "select * from sign_student as t where open_id =?1 order by sign_id desc limit 0,1",nativeQuery = true)
    List<SignStudent> findByOpenId(String openID);

}
