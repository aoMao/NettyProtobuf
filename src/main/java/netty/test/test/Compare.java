package netty.test.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.protobuf.InvalidProtocolBufferException;
import netty.test.message.login.LoginProto;

public class Compare {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        // JSON
        LoginReq req = new LoginReq();
        req.age = 1000000000;
        req.id = 1000000000000000000l;
        req.code = "asdas";
        req.name = "asd";

        String str = JSON.toJSONString(req);
        byte[] bytes = str.getBytes();
        System.out.println("json length: " + bytes.length);

        // 次数转化
        long now = System.currentTimeMillis();
        for (int i = 0; i < 1000000; ++i) {
            str = JSON.toJSONString(req);
            bytes = str.getBytes();
        }
        System.out.println("100w次转byte消耗时间：" + (System.currentTimeMillis() - now) + "ms");

        now = System.currentTimeMillis();
        for (int i = 0; i < 1000000; ++i) {
            LoginReq q = JSON.parseObject(str, LoginReq.class);
        }
        System.out.println("100w次转obj消耗时间：" + (System.currentTimeMillis() - now) + "ms");

        LoginProto.LoginReq.Builder builder = LoginProto.LoginReq.newBuilder();
        builder.setAge(req.age);
        builder.setId(req.id);
        builder.setName(req.name);
        builder.setCode(req.code);

        bytes = builder.build().toByteArray();
        System.out.println("proto length: " + bytes.length);

        now = System.currentTimeMillis();
        for (int i = 0; i < 1000000; ++i) {
            bytes = builder.build().toByteArray();
        }
        System.out.println("100w次转byte消耗时间：" + (System.currentTimeMillis() - now) + "ms");

        now = System.currentTimeMillis();
        for (int i = 0; i < 1000000; ++i) {
            LoginProto.LoginReq q = LoginProto.LoginReq.parseFrom(bytes);
        }
        System.out.println("100w次转proto消耗时间：" + (System.currentTimeMillis() - now) + "ms");
    }

    static class LoginReq {
        private long id;
        private String code;
        private String name;
        private int age;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
