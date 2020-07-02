package netty.test.common.handler.login;

import io.netty.channel.Channel;
import netty.test.annotation.Handler;
import netty.test.common.handler.Basehandler;
import netty.test.message.login.LoginProto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Handler(LoginProto.LoginReq.class)
public class LoginReqHandler extends Basehandler<LoginProto.LoginReq> {
    private Map<Long, LoginProto.LoginResp.Builder> userMap = new ConcurrentHashMap<>();

    private AtomicLong atomicLong = new AtomicLong(0);

    @Override
    public void handler(int protoId, Channel channel, LoginProto.LoginReq msg) {
        LoginProto.LoginResp.Builder builder;
        if (msg.getId() != 0) {
            builder = userMap.get(msg.getId());

        } else {
            long id = atomicLong.incrementAndGet();
            builder = LoginProto.LoginResp.newBuilder();
            builder.setAge(msg.getAge());
            builder.setId(id);
            builder.setResult(LoginProto.LoginResult.SUCCESS);
            builder.setName(msg.getName());
            builder.addLoginTimes(System.currentTimeMillis());
            userMap.put(id, builder);
        }

        builder.addLoginTimes(System.currentTimeMillis());
        channel.writeAndFlush(builder.build());
    }
}
