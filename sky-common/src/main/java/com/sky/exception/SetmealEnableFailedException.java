package com.sky.exception;

/**
 * 套餐启用失败异常
 * @author Augus
 */
public class SetmealEnableFailedException extends BaseException {

    public SetmealEnableFailedException(){}

    public SetmealEnableFailedException(String msg){
        super(msg);
    }
}
