package com.Allen.store.service;

import com.Allen.store.entity.User;

/**
 * @author 邓志恒
 * @version 1.0
 **/

public interface IUserService {
    /**
     * 注册
     * @param user
     */
    void reg(User user);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);

    /**
     * 改密码
     * @param uid
     * @param username
     * @param oldPassword
     * @param newPassword
     */
    public void changePassword(Integer uid, String username, String oldPassword, String newPassword);

    /**
     * 当前用户信息
     * @param uid
     * @return
     */
    User getByUid(Integer uid);

    /**
     * 修改资料
     * @param uid
     * @param username
     * @param user
     */
    void changeInfo(Integer uid, String username, User user);


    /**
     * 修改头像
     * @param uid
     * @param username
     * @param avatar
     */
    void changeAvatar(Integer uid, String username, String avatar);
}

