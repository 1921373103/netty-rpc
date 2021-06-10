package com.rpc.server.register;

import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceRegistry {

//    @Value("${rpc.registry.address}")
    private String registryAddress = "1.15.138.107:2181";

    private static final String ZK_REGISTRY_PATH = "/rpc";

    public void register(String data) {
        if (data != null) {
            ZkClient client = connectServer();
            if (client != null) {
                AddRootNode(client);
                createNode(client, data);
            }
        }
    }
	//连接zookeeper
    private ZkClient connectServer() {
        ZkClient client = new ZkClient(registryAddress,40000,20000);
        return client;
    }
	//创建根目录/rpc
    private void AddRootNode(ZkClient client){
        boolean exists = client.exists(ZK_REGISTRY_PATH);
        if (!exists){
            client.createPersistent(ZK_REGISTRY_PATH);
            log.info("创建zookeeper主节点 {}",ZK_REGISTRY_PATH);
        }
    }
	//在/rpc根目录下，创建临时顺序子节点
    private void createNode(ZkClient client, String data) {
        String path = client.create(ZK_REGISTRY_PATH + "/provider", data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        log.info("创建zookeeper数据节点 ({} => {})", path, data);
    }
}
