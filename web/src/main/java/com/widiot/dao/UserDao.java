package com.widiot.dao;

import com.widiot.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * 查找用户名
     *
     * @param username 登录用户名
     * @return
     */
    User findByUsername(String username);

    /**
     * 注册用户和密码
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    User registerByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 更新GUID
     *
     * @param guid     GUID
     * @param username 用户名
     * @return
     */
    void updateGUID(@Param("username") String username, @Param("guid") String guid);

    User checkScan(@Param("guid") String guid);
}
