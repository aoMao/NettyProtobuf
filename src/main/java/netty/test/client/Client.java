package netty.test.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import netty.test.common.handler.netty.ClientChannelHandlerInitialize;
import netty.test.common.handler.netty.HeartBeartHandler;
import netty.test.message.Test;
import netty.test.message.login.LoginProto;
import netty.test.util.HandlerManager;
import netty.test.util.MessageManager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Client {
    EventLoopGroup workGroup;

    Bootstrap bootstrap;

    public Client() {
        workGroup = new NioEventLoopGroup(1);
        bootstrap = new Bootstrap();
    }

    public void connect(String ip, int port) throws InterruptedException {

        try {
            bootstrap.group(workGroup).channel(NioSocketChannel.class)
                    .handler(new ClientChannelHandlerInitialize());
            ChannelFuture future = bootstrap.connect(ip, port).sync();
            if (future.isSuccess()) {
                // 发送登录消息
                LoginProto.LoginReq.Builder builder = LoginProto.LoginReq.newBuilder();
                builder.setCode("adfas");
                builder.setAge(12);
                builder.setName("aaa");
                System.out.println("登录");
                ByteBuf byteBuf = Unpooled.buffer();
                byteBuf.writeInt(1024);
                byte[] bytes = builder.build().toByteArray();
                byteBuf.writeInt(bytes.length);
                byteBuf.writeBytes(bytes);
                future.channel().writeAndFlush(byteBuf);

                startHeart(future.channel());
            }

            future.channel().closeFuture().sync();
        } finally {
            workGroup.shutdownGracefully();
        }
    }

    /**
     * 开启心跳
     *
     * @param channel
     */
    private void startHeart(Channel channel) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                ByteBuf byteBuf = Unpooled.buffer();
                byteBuf.writeByte(HeartBeartHandler.CHECK_RESULT ^ HeartBeartHandler.HEART_BYTE_MASK);
                channel.writeAndFlush(byteBuf);
            }
        }, 1, 5, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                // 发送test消息
                System.out.println("发送测试消息");
                Test.Builder builder = Test.newBuilder();
                builder.setName("aaa");
                channel.writeAndFlush(builder.build());
            }
        }, 1,5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        MessageManager.getInstance().init();
        HandlerManager.getInstance().init();
        new Client().connect("localhost", 7000);
    }
}
