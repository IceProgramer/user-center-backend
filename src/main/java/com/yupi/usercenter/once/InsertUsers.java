package com.yupi.usercenter.once;
import java.util.Date;

import com.yupi.usercenter.mapper.UserMapper;
import com.yupi.usercenter.model.domain.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

@Component
public class InsertUsers {

    @Resource
    private UserMapper userMapper;

    /**
     * 批量插入用户
     */
//    @Scheduled(initialDelay = 5000, fixedRate = Long.MAX_VALUE)
    public void doInsertUsers() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 1000;
        for (int i = 0; i < INSERT_NUM; i++) {
//            User user = new User();
//            user.setUsername("假IceMan");
//            user.setUserAccount("fakeIceMan");
//            user.setAvatarUrl("https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png");
//            user.setGender(0);
//            user.setUserPassword("12345678");
//            user.setPhone("123");
//            user.setEmail("123@qq.com");
//            user.setUserStatus(0);
//            user.setTags("[]");
//            user.setUserRole(0);
//            user.setPlanetCode("11111111");
//            userMapper.insert(user);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }
}
