package com.rpc.server.service;

import com.rpc.server.entity.DeviceInfo;

import java.util.List;

/**
 * @ Author L
 * @ Date 2021/5/14 14:07
 * @ DESC
 */

public interface DemoService {

    String SayHey(String name);

    List<DeviceInfo> list(DeviceInfo deviceInfo);

}
