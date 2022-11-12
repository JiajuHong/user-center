package com.jiaju.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -3107856573896447986L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
