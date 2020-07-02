package netty.test.common.handler.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import netty.test.common.codec.MessageDecoder;
import netty.test.common.codec.MessageEncoder;

public class ClientChannelHandlerInitialize extends ChannelInitializer {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(204800, 4, 4));
        ch.pipeline().addLast(new MessageEncoder());
        ch.pipeline().addLast(new MessageDecoder());
        ch.pipeline().addLast(new CustomChannelHandler());
    }
}
