package com.jiaju.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -3107856573896447986L;

    private String userAccount;

    private String userPassword;
}
