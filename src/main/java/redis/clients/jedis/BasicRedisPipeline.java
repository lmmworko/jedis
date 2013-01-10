package redis.clients.jedis;


import java.util.List;

/**
 * Pipelined responses for all of the low level, non key related commands
 */
public interface BasicRedisPipeline {

    Response<String> bgrewriteaof();

    Response<String> bgsave();

    Response<String> configGet(String pattern);

    Response<String> configSet(String parameter, String value);

    Response<String> configResetStat();

    Response<String> save();

    Response<Long> lastsave();

    Response<String> discard();

    Response<List<Object>> exec();

    Response<String> multi();

    Response<String> flushDB();

    Response<String> flushAll();

    Response<String> info();

    Response<Long> dbSize();

    Response<String> shutdown();

    Response<String> ping();

    Response<String> select(int index);
}