package netty.test.common.codec;

/**
 * 自定义消息
 */
public class CustomMessage {
    int protoId;
    Object msg;

    public CustomMessage(int protoId, Object msg) {
        this.protoId = protoId;
        this.msg = msg;
    }

    public int getProtoId() {
        return protoId;
    }

    public void setProtoId(int protoId) {
        this.protoId = protoId;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
