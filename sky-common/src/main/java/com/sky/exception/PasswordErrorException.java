package com.sky.exception;

/**
 * 密码错误异常
 * @author Augus
 */
public class PasswordErrorException extends BaseException {

    public PasswordErrorException() {
    }

    public PasswordErrorException(String msg) {
        super(msg);
    }

}
