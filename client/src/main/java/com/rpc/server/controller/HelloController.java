package com.rpc.server.controller;

import com.rpc.server.entity.DeviceInfo;
import com.rpc.server.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    public DeviceService deviceService;

    /**
     * 客户端调用远程服务不能使用输出语句打印数据，可使用log
     *
     * @param deviceInfo
     * @return
     */
    @GetMapping("/list")
    public List<DeviceInfo> list(DeviceInfo deviceInfo) {
        List<DeviceInfo> list = deviceService.list(deviceInfo);
        log.info("list =" + list);
        return list;
    }

}
