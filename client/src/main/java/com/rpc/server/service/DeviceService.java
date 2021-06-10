package com.rpc.server.service;

import com.rpc.server.entity.DeviceInfo;

import java.util.List;

/**
 * @ Author L
 * @ Date 2021/6/9 14:03
 * @ DESC
 */
public interface DeviceService {

    List<DeviceInfo> list(DeviceInfo deviceInfo);
}
