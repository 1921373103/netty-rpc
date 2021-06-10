package com.rpc.server.service.impl;

import com.rpc.server.entity.DeviceInfo;
import com.rpc.server.mapper.DeviceInfoMapper;
import com.rpc.server.service.DeviceService;
import com.rpc.server.utils.RpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ Author L
 * @ Date 2021/6/9 14:03
 * @ DESC
 */
@RpcService
public class DeivceServiceImpl implements DeviceService {

    @Autowired
    public DeviceInfoMapper deviceInfoMapper;

    @Override
    public List<DeviceInfo> list(DeviceInfo deviceInfo) {
        List<DeviceInfo> list = deviceInfoMapper.list(deviceInfo);
        return list;
    }
}
