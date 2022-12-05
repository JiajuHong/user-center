package com.jiaju.usercenter.common;

public enum ErrorCode {
    SUCCESS(0, "ok", "成功"),
    PARAMS_ERROR(40000, "params error", "参数错误"),
    NULL_ERROR(4001, "null error", "请求参数为空"),
    NOT_LOGIN(40100, "not login", "未登录"),
    NO_AUTH(40101, "no auth", "无权限"),

    SYSTEM_ERROR(50000, "system error", "系统内部错误"),
    ;
    private final int code; // 错误码
    private final String msg; // 错误信息
    private final String desc; // 错误描述

    ErrorCode(int code, String msg, String desc) {
        this.code = code;
        this.msg = msg;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getDesc() {
        return desc;
    }
}
