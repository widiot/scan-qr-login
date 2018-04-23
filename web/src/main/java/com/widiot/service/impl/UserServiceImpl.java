package com.widiot.service.impl;

import com.widiot.dao.UserDao;
import com.widiot.entity.User;
import com.widiot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //检验用户登录业务
    public User checkLogin(String username, String password) {
        User user = userDao.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    //更新GUID
    public void updateGUID(String username, String guid) {
        userDao.updateGUID(username, guid);
    }

    //检查是否扫码
    public User checkScan(String guid) {
        User user = userDao.checkScan(guid);
        return user;
    }
}