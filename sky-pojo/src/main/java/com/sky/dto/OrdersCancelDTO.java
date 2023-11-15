package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Augus
 */
@Data
public class OrdersCancelDTO implements Serializable {

    private Long id;
    //订单取消原因
    private String cancelReason;

}
