package netty.test.util;

import netty.test.annotation.MessageAnno;
import netty.test.message.Test;
import netty.test.message.login.LoginProto;

/**
 * 协议定义类
 */
public class MessageConst {
    @MessageAnno(Test.class)
    public static final int TEST_PROTO = 1;
    @MessageAnno(LoginProto.LoginReq.class)
    public static final int LOGIN_REQ = 2;
    @MessageAnno(LoginProto.LoginResp.class)
    public static final int LOGIN_RESP = 3;

    public int a = 4;
}
