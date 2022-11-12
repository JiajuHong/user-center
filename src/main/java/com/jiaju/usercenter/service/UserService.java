package com.jiaju.usercenter.service;

import com.jiaju.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author jiaju
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-10-07 16:59:45
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 用户 id
     */

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

}
