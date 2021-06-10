package com.rpc.server.entity;

import lombok.Data;

/**
 * @ Author L
 * @ Date 2021/6/9 11:01
 * @ DESC
 */
@Data
public class DeviceInfo {

    private Long sn;

    private String ip;

    private Long port;

    private String info;

    private String type;
}
