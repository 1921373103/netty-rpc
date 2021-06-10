package com.rpc.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务端启动类
 *
 * @ Author L
 * @ Date 2021/5/13 15:26
 * @ DESC
 */
@SpringBootApplication
@MapperScan("com.rpc.server.mapper")
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
