package com.luca.service;

import com.luca.po.User;

/**
 * @author Luca
 * @Description 20:28
 */
public interface UserService {

    //检查用户名、用户密码
    User checkUser(String username, String password);

}
