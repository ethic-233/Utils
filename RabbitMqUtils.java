package com.ethic.rabbitmq.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.channels.Channel;
import java.util.concurrent.TimeoutException;

/**
 * 此类为连接工厂创建信道的工具类
 */
public class RabbitMqUtils {

    // 得到一个连接的channel
    public static Channel getChannel() throws IOException, TimeoutException {
        // 创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("182.92.234.71");
        factory.setUsername("admin");
        factory.setPassword("123");
        Connection connection = factory.newConnection();
        Channel channel = (Channel) connection.createChannel();
        return channel;
    }
}
