package netty.test.common.handler.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

public class HeartBeartHandler extends ChannelInboundHandlerAdapter {

    public static final byte HEART_BYTE_MASK = 0x1F;
    public static final byte CHECK_RESULT = 0x34;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof ByteBuf) {
            ByteBuf byteBuf = (ByteBuf) msg;
            byteBuf.markReaderIndex();
            byte b = byteBuf.readByte();
            if ((b ^ HEART_BYTE_MASK) == CHECK_RESULT) {
                System.out.println("心跳协议");
                return;
            } else {
                byteBuf.resetReaderIndex();
            }
        }

        ctx.fireChannelRead(msg);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            System.out.println("心跳超时");
            IdleStateEvent event = (IdleStateEvent) evt;
            switch (event.state()) {
                case READER_IDLE:
                    ctx.channel().close();
                    break;
                case WRITER_IDLE:
                case ALL_IDLE:
                default:
                    break;
            }
        }
        super.userEventTriggered(ctx, evt);
    }
}
