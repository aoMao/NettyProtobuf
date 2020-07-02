package netty.test.common.handler.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.timeout.IdleStateHandler;
import netty.test.common.codec.MessageDecoder;
import netty.test.common.codec.MessageEncoder;

public class ServerChannelHandlerInitialize extends ChannelInitializer {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline().addLast(new IdleStateHandler(10, 10, 10));
        ch.pipeline().addLast(new HeartBeartHandler());
        ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(204800, 4, 4));
        ch.pipeline().addLast(new MessageEncoder());
        ch.pipeline().addLast(new MessageDecoder());
        ch.pipeline().addLast(new CustomChannelHandler());
    }
}
