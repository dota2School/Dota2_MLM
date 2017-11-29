package org.dota2school.mlm.wx.repository;


import org.dota2school.mlm.wx.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author xujq
 * @time 2017-7-10
 */
public interface UserRepository extends JpaRepository<User,String> {

}
