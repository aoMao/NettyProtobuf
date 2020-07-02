package netty.test.common.codec;

import com.google.protobuf.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import netty.test.util.MessageManager;

import java.util.List;

/**
 * 协议解析
 */
public class MessageDecoder extends ByteToMessageDecoder {

    /**
     * 消息头长度，int + int（protoId + length）
     */
    private static final int HEAD_LENGTH = 4 + 4;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List out) throws Exception {
        // 此处不检查长度是否符合标准
        in.markReaderIndex();
        int protoId = in.readInt();
        int length = in.readInt();

        // parse
        Parser parser = MessageManager.getInstance().getParse(protoId);
        if (parser == null) {
            in.skipBytes(length);
            System.out.println("协议id错误，跳过此条消息。协议id：" + protoId);
            return;
        }

        byte[] bytes = new byte[length];
        in.readBytes(bytes);

        try {
            Object message = parser.parseFrom(bytes);
            CustomMessage customMessage = new CustomMessage(protoId, message);
            out.add(customMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
