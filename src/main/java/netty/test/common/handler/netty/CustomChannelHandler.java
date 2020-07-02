package netty.test.common.handler.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import netty.test.common.Dispatcher;
import netty.test.common.codec.CustomMessage;

/**
 * dispatcher
 */
public class CustomChannelHandler extends SimpleChannelInboundHandler<CustomMessage> {

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端链接成功");
        super.channelRegistered(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CustomMessage msg) throws Exception {
        Dispatcher.dispatcher(msg.getProtoId(), ctx.channel(), msg.getMsg());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端断开连接");
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
