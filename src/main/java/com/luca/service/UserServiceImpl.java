package com.luca.service;

import com.luca.dao.UserRepository;
import com.luca.po.User;
import com.luca.util.MD5Utils;
import org.springframework.stereotype.Service;

/**
 * @author Luca
 * @Description 20:29
 */
//@Service ：代表是可用的注解
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

}
