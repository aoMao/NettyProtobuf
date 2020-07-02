package netty.test.util;

import io.netty.channel.Channel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ChannelManager {

    private static final ChannelManager instance = new ChannelManager();
    private ChannelManager() {}

    public static ChannelManager getInstance() {
        return instance;
    }

    private AtomicLong cid = new AtomicLong();

    private Map<Long, Channel> channelMap = new ConcurrentHashMap<>();
    private Map<Channel, Long> channelLongMap = new ConcurrentHashMap<>();

    /**
     * 添加链接
     * @param channel
     * @return
     */
    public long addChannel(Channel channel) {
        long chid = cid.incrementAndGet();
        channelMap.put(chid, channel);
        channelLongMap.put(channel, chid);
        return chid;
    }

    public long removeChannel(Channel channel) {
        Long channelId = channelLongMap.remove(channel);
        if (channelId == null) {
            return -1;
        }
        channelMap.remove(channelId);
        return channelId;
    }
}
