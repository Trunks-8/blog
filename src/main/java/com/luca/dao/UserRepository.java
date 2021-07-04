package com.luca.dao;

import com.luca.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Luca
 * @Description 20:30
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);

}
