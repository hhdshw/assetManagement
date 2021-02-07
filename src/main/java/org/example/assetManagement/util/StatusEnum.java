package org.example.assetManagement.util;

/**
 * @author Jadmin
 * @date 2020/1/13
 */

public enum StatusEnum {

    LOGIN_ERROR(500, "用户名或密码错误"),
    PARAM_ERROR(401, "参数错误"),
    VERTIFY_ERROR(206, "验证码错误"),
    USER_ERROR(500, "获取用户信息失败"),
    LOGOUT_ERROR(500, "退出失败"),
    SYSTEM_ERROR(500, "系统内部错误"),
    COMMON_ERROR(500, "系统内部错误"),
    FILE_ERROR(400, "上传的文件为空"),
    COMMON_SUCCESS(200, "成功"),
    RESET_SUCCESS(200, "重置密码成功");

    private final int code;
    private final String msg;


    StatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}