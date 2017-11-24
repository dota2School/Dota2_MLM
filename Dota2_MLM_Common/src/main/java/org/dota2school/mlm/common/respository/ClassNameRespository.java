package org.dota2school.mlm.common.respository;


import org.dota2school.mlm.common.domain.ClassName;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nt on 2017/9/3.
 */
public interface ClassNameRespository extends JpaRepository<ClassName,String> {
}
