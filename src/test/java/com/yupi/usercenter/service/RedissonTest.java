package com.yupi.usercenter.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void test() {
        // List
        RList<String> rList = redissonClient.getList("test-list");
        rList.add("yupi");

        // Map
        RMap<Object, Object> map = redissonClient.getMap("test-map");
        map.put("yupi", 1);
    }
}
