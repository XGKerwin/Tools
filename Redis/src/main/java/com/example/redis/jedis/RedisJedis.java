package com.example.redis.jedis;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author 关鑫
 * @date 2022/1/8 星期六
 * @Description com.example.redis.jedis
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class RedisJedis {



    /**
     * 原生方法
     * 1.导入jedis的包
     * <!-- https://mvnrepository.com/artifact/redis.clients/jedis -->
     * <dependency>
     * <groupId>redis.clients</groupId>
     * <artifactId>jedis</artifactId>
     * <version>3.3.0</version>
     * </dependency>
     * <dependency>
     * <groupId>com.alibaba</groupId>
     * <artifactId>fastjson</artifactId>
     * <version>1.2.9</version>
     * </dependency>
     */


    /**
     * 原生方法
     *
     * @return
     */
    @GetMapping("/redis")
    public String getRedis() {
        // new Jedis对象
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        // jedis 所有命令都是方法
        System.out.println(jedis.ping());
        System.out.println("清空数据：" + jedis.flushDB());
        System.out.println("判断某个键是否存在：" + jedis.exists("username"));
        System.out.println("新增<'username','guanxin'>的键值对：" + jedis.set("username", "guanxin"));
        System.out.println("新增<'password',password'>的键值对：" + jedis.set("password", "password"));
        System.out.println("所有的键");
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
        System.out.println("删除键password：" + jedis.del("password"));
        System.out.println("判断键password是否存在：" + jedis.exists("password"));
        System.out.println("查看键username所存储的值的类型：" + jedis.type("username"));
        System.out.println("随机返回key空间的一个：" + jedis.randomKey());
        System.out.println("重命名key：" + jedis.rename("username", "name"));
        System.out.println("取出改后的name：" + jedis.get("name"));
        System.out.println("按索引查询：" + jedis.select(0));
//        System.out.println("删除当前选择数据库中的所有key：" + jedis.flushDB());
        System.out.println("返回当前数据库中key的数目：" + jedis.dbSize());
        System.out.println("删除所有数据库中的所有key：" + jedis.flushAll());

        // 设置过期时间  10秒过期
        System.out.println(jedis.setex("key3", 10, "as"));

        return "ok";
    }


}
