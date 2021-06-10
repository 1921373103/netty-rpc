package com.rpc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rpc.server.entity.DeviceInfo;

import java.util.List;

/**
 * @ Author L
 * @ Date 2021/6/9 11:02
 * @ DESC
 */
public interface DeviceInfoMapper extends BaseMapper<DeviceInfo> {

    List<DeviceInfo> list(DeviceInfo deviceInfo);
}
