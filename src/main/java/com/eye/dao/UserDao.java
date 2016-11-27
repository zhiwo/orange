package com.eye.dao;

import com.eye.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户表
 */
public interface UserDao {

    @Select(value = "select * from net_user")
    public List<User> getUserList();


    @Insert(value = "insert into net_user values(#{uId},#{uName},#{uPhone},#{uSecondPhone},#{uThreePhone},#{uEmail},#{uPassword}," +
            "#{uRdcId},#{uABID},#{uIntegral})")
    public int insert(User user);


    @Update(value = "update net_user set uName=#{uName},uPhone=#{uPhone},uSecondPhone=#{uSecondPhone},uThreePhone=#{uThreePhone}," +
            "uEmail=#{uEmail},uPassword=#{uPassword},uIntegral=#{uIntegral } where id=#{id}")
    public int update(User user);

    @Delete(value = "delete from net_user where id=#{id}")
    public int delete(@Param("id") int id);

}
