package com.example.news.exception;

/**
 * Function: 权限异常
 *
 * @author miluo
 * Date: 2018/10/25 6:17 PM
 * @since JDK 1.8
 */
public class AuthenticationException extends Exception {

    /**
     * 错误编码
     */
    private String errCode;


    /**
     * 错误消息
     */
    private String errMsg;


    public AuthenticationException() {
        super();
    }

    public AuthenticationException(String message) {
        super(message);
        this.errMsg = errMsg;
    }

    public AuthenticationException(String errCode, String errMsg) {
        super();
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
