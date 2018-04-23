package com.widiot.service;

import com.widiot.entity.User;

//Service层接口
public interface UserService {
    //检验用户登录
    User checkLogin(String username, String password);

    //更新GUID
    void updateGUID(String username, String guid);

    //检查是否扫码
    User checkScan(String guid);
}