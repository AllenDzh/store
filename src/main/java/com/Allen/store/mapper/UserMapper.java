package com.Allen.store.mapper;

import com.Allen.store.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @author 邓志恒
 * @version 1.0
 **/
public interface UserMapper {

    /**
     *  插入用户数据
     * @param user
     * @return
     */
    Integer insert(User user);

    /**
     *  根据用户名查询用户数据
     * @param username
     * @return
     */
    User findByUsername(String username);

    /**
     *根据uid更新用户的密码
     * @param uid
     * @param password
     * @param modifiedUser
     * @param modifiedTime
     * @return
     */
    Integer updatePasswordByUid(
            @Param("uid") Integer uid,
            @Param("password") String password,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);

    /**
     *根据用户id查询用户数据
     * @param uid
     * @return
     */
    User findByUid(Integer uid);

    /**
     *根据uid更新用户资料
     * @param user
     * @return
     */
    Integer updateInfoByUid(User user);

    /**
     *根据uid更新用户的头像
     * @param uid
     * @param avatar
     * @param modifiedUser
     * @param modifiedTime
     * @return
     */
    Integer updateAvatarByUid(
            @Param("uid") Integer uid,
            @Param("avatar") String avatar,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);

}
