package com.jiaju.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 响应基类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;

    private T data;

    private String msg;

    private String desc;

    public BaseResponse(int code, T data, String msg, String desc) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.desc = desc;
    }

    public BaseResponse(int code, T data, String msg) {
        this(code, data, msg, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMsg(), errorCode.getDesc());
    }
}
