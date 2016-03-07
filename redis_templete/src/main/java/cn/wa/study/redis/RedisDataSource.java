package cn.wa.study.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * Created by liupd on 16-3-4.
 **/

public interface RedisDataSource {

    //取得redis的客户端，可以执行命令了。
    public abstract ShardedJedis getRedisClient();

    // 将资源返还给pool
    public void returnResource(ShardedJedis shardedJedis);

    //出现异常后，将资源返还给pool （其实不需要第二个方法）
    public void returnResource(ShardedJedis shardedJedis,boolean broken);

}
