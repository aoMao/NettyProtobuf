package netty.test.common.handler.login;

import io.netty.channel.Channel;
import netty.test.annotation.Handler;
import netty.test.common.handler.Basehandler;
import netty.test.message.login.LoginProto;

@Handler(LoginProto.LoginResp.class)
public class LoginRespHandler extends Basehandler<LoginProto.LoginResp> {

    @Override
    public void handler(int protoId, Channel channel, LoginProto.LoginResp msg) {
        System.out.println(msg.toString());
    }
}
