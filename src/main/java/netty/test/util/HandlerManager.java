package netty.test.util;

import netty.test.annotation.Handler;
import netty.test.common.handler.Basehandler;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * handler管理
 */
public class HandlerManager {
    private static final HandlerManager instance = new HandlerManager();

    private HandlerManager() {
    }

    public static HandlerManager getInstance() {
        return instance;
    }

    private Map<Integer, Basehandler> handlerMap = new HashMap<>();

    private static final String SCAN_PACKAGE = "netty.test.common.handler";

    public void init() {
        Reflections reflections = new Reflections(SCAN_PACKAGE);
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Handler.class);
        for (Class c : classes) {
            try {
                Annotation handler = c.getAnnotation(Handler.class);
                if (handler == null) {
                    System.out.println("未定义messageclass，handlerclass：" + c.getName());
                    return;
                }

                Object o = c.newInstance();
                if (o instanceof Basehandler) {
                    Class messageClass = ((Handler) handler).value();
                    int id = MessageManager.getInstance().getMessageId(messageClass);
                    if (id > -1) {
                        handlerMap.put(id, (Basehandler) o);
                    }
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public Basehandler getByProtoId(int protoId) {
        if (handlerMap.containsKey(protoId)) {
            return handlerMap.get(protoId);
        }

        return null;
    }

    public static void main(String[] args) {
        MessageManager.getInstance().init();
        instance.init();
        Basehandler basehandler = instance.getByProtoId(1);
        System.out.println(basehandler.getClass().getName());
    }
}
