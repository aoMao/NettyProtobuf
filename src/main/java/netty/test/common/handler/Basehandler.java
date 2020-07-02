package netty.test.common.handler;


import io.netty.channel.Channel;

public abstract class Basehandler<T> {
    public abstract void handler(int protoId, Channel channel, T msg);
}
