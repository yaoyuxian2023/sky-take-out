package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * C端用户登录
 * @author Augus
 */
@Data
public class UserLoginDTO implements Serializable {

    private String code;

}
