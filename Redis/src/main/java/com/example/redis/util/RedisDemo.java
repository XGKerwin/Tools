package com.example.redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisDemo {

    /*
    在SpringBoot2.X以后 原来的jedis 被替换为lettuce
       <dependency>
            <groupId>io.lettuce</groupId>
            <artifactId>lettuce-core</artifactId>
        </dependency>

        jedis: 采用的直连，多个线程操作的话，不安全，如果想避免不安全 使用jedis pool连接池！
        lettuce: 采用netty，实例可以再多个线程中进行共享，不存在线程不安全的情况！可以减少线程数据了，更像 NIO 模式


    1.导入包
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>
     2. # 配置redis
            redis:
              host: 127.0.0.1
              port: 6379
     3. // redisTemplate.opsForValue() 主要是处理字符串类型
        // redisTemplate.opsForHash()  主要是用来处理哈希
     */

//    @Autowired
//    @Qualifier("redisTemplate")  // 抢过注解使用我们自定义的
//    private RedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/getRedisUtil")
    public String getRedisUtil() {
        redisUtil.set("username", "kerwin");
        System.out.println(redisUtil.get("username"));
        return "ok";
    }


    @GetMapping("/goredis")
    public Object getredis() {
        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        System.out.println(connection.ping());      // 是否连接成功
//        connection.flushAll();                      // 清空所有数据库
//        connection.flushDb();                       // 清空当前数据库数据
        return "ok";
    }






}
