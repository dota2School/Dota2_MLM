package org.dota2school.mlm.common.respository;


import org.dota2school.mlm.common.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author xujq
 * @time 2017-7-10
 */
public interface UserRespository  extends JpaRepository<User,String> {

}
