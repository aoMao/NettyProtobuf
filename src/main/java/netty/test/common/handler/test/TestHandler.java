package netty.test.common.handler.test;

import io.netty.channel.Channel;
import netty.test.annotation.Handler;
import netty.test.common.handler.Basehandler;
import netty.test.message.Test;

@Handler(Test.class)
public class TestHandler extends Basehandler<Test> {
    @Override
    public void handler(int protoId, Channel channel, Test msg) {
        System.out.println(msg.toString());
    }
}
