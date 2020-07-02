package netty.test.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import netty.test.common.handler.netty.ServerChannelHandlerInitialize;
import netty.test.util.HandlerManager;
import netty.test.util.MessageManager;

public class Server {

    EventLoopGroup bossGroup;
    EventLoopGroup workGroup;

    ServerBootstrap serverBootstrap;

    public Server() {
        bossGroup = new NioEventLoopGroup(1);
        workGroup = new NioEventLoopGroup(1);
        serverBootstrap = new ServerBootstrap();
    }

    public void start(int port) throws InterruptedException {
        try {
            serverBootstrap.group(bossGroup, workGroup).channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childHandler(new ServerChannelHandlerInitialize());
            ChannelFuture future = serverBootstrap.bind(port).sync();

            future.addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    if (future.isSuccess()) {
                        System.out.println("开启端口成功，端口：" + port);
                    } else {
                        System.out.println("开启端口失败");
                    }
                }
            });
            future.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MessageManager.getInstance().init();
        HandlerManager.getInstance().init();
        new Server().start(7000);
    }

}
