package com.rpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ Author L
 * @ Date 2021/5/13 16:42
 * @ DESC
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
