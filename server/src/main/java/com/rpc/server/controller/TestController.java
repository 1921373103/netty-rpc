package com.rpc.server.controller;

import com.rpc.server.entity.DeviceInfo;
import com.rpc.server.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author L
 * @ Date 2021/6/10 13:53
 * @ DESC
 */
@RestController
public class TestController {

    @Autowired
    public DeviceService deviceService;

    @GetMapping("/list")
    public List<DeviceInfo> demo(DeviceInfo deviceInfo) {
        final List<DeviceInfo> list = deviceService.list(deviceInfo);
        for (DeviceInfo info : list) {
            System.out.println("info = " + info);
        }
        return list;
    }
}
