package netty.test.util;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import netty.test.annotation.MessageAnno;
import netty.test.message.login.LoginProto;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 协议管理
 */
public class MessageManager {

    private static final MessageManager instance = new MessageManager();

    private MessageManager() {

    }

    public static MessageManager getInstance() {
        return instance;
    }

    private Map<Integer, Parser> parserMap = new HashMap<>();

    private Map<Class, Integer> messageIdMap = new HashMap<>();

    /**
     * 初始化，读取配置
     */
    public void init() {
        Class constClz = MessageConst.class;
        for (Field field : constClz.getDeclaredFields()) {
            field.setAccessible(true);

            MessageAnno annotation = field.getAnnotation(MessageAnno.class);
            if (annotation != null) {
                try {
                    int id = field.getInt(null);
                    Class messageClass = annotation.value();
                    Field parseField = messageClass.getDeclaredField("PARSER");
                    if (parseField != null) {
                        parseField.setAccessible(true);

                        Object parse = parseField.get(null);
                        if (parse instanceof Parser) {
                            parserMap.put(id, (Parser) parse);
                            messageIdMap.put(messageClass, id);
                        } else {
                            System.out.println("not find parse, id is ：" + id);
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

        System.out.println("init success");
    }

    public int getMessageId(Class clz) {
        if (messageIdMap.containsKey(clz)) {
            return messageIdMap.get(clz);
        }

        return -1;
    }

    public Parser getParse(int id) {
        if (parserMap.containsKey(id)) {
            return parserMap.get(id);
        }
        return null;
    }

    public static void main(String[] args) throws IllegalAccessException, InvalidProtocolBufferException {
        instance.init();

        LoginProto.LoginReq.Builder builder = LoginProto.LoginReq.newBuilder();
        builder.setAge(1);
        builder.setId(1);
        builder.setCode("asdfa");
        byte[] bytes = builder.buildPartial().toByteArray();

        int id = instance.getMessageId(LoginProto.LoginReq.class);
        Parser parser = instance.parserMap.get(id);
        LoginProto.LoginReq o = (LoginProto.LoginReq) parser.parseFrom(bytes);
        System.out.println(o.getAge());
        System.out.println(o.getId());
        System.out.println(o.getCode());
    }
}
