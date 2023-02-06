package com.yupi.usercenter.mapper;

import com.yupi.usercenter.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Entity com.yupi.usercenter.model.domain.User
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where userAccount = #{userAccount} and userPassword = #{password}")
    User getByUsernameAndPassword(String userAccount, String password);
}




