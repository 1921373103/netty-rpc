package com.rpc.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rpc.server.entity.DeviceInfo;
import com.rpc.server.mapper.DeviceInfoMapper;
import com.rpc.server.service.DemoService;
import com.rpc.server.utils.RpcService;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import javax.annotation.Resource;
import java.util.List;


/**
 * @ Author L
 * @ Date 2021/5/14 14:08
 * @ DESC
 */
@RpcService
public class DemoServiceImpl implements DemoService {

    @Autowired
    public DeviceInfoMapper deviceInfoMapper;

    @Override
    public String SayHey(String name) {
        return "hello :" + name;
    }

    @Override
    public List<DeviceInfo> list(DeviceInfo deviceInfo) {
        /*LambdaQueryWrapper<DeviceInfo> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(DeviceInfo::getSn, 12345678)
                .or()
                .eq(DeviceInfo::getIp, 99);
        return deviceInfoMapper.selectList(lambdaQueryWrapper);*/
        return deviceInfoMapper.list(deviceInfo);
    }
}
