package netty.test.common;

import io.netty.channel.Channel;
import netty.test.common.handler.Basehandler;
import netty.test.util.HandlerManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dispatcher {
    static ExecutorService executor = Executors.newFixedThreadPool(3);

    public static final void dispatcher(int protoId, Channel channel, Object msg) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                Basehandler basehandler = HandlerManager.getInstance().getByProtoId(protoId);
                if (basehandler != null) {
                    basehandler.handler(protoId, channel, msg);
                }
            }
        });
    }
}
