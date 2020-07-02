package netty.test.common.codec;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import netty.test.util.MessageManager;

/**
 * 写消息
 */
public class MessageEncoder extends MessageToByteEncoder<GeneratedMessageV3> {

    @Override
    protected void encode(ChannelHandlerContext ctx, GeneratedMessageV3 msg, ByteBuf out) throws Exception {
        int protoId = MessageManager.getInstance().getMessageId(msg.getClass());
        if (protoId < 0) {
            return;
        }

        out.writeInt(protoId);
        byte[] bytes = msg.toByteArray();
        out.writeInt(bytes.length);
        out.writeBytes(bytes);
    }
}
