package com.rpc.server.utils;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * 将 RpcRequest 编码成字节序列发送
 * 消息格式: Length + Content
 * Length使用int存储,标识消息体的长度
 * <p>
 * +--------+----------------+
 * | Length | Content  |
 * | 4字节 | Length个字节 |
 * +--------+----------------+
 */
public class JsonEncoder extends MessageToMessageEncoder {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object msg, List out){
        ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer();
        byte[] bytes = JSON.toJSONBytes(msg);
        byteBuf.writeInt(bytes.length);
        byteBuf.writeBytes(bytes);
        out.add(byteBuf);
    }
}