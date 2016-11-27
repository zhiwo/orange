package com.eye.dao;

import com.eye.entity.TTBL;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户积分
 */
public interface TTBLDao {
    @Select("select * from net_ttbl")
    public List<TTBL> getList();

    @Insert("insert into net_ttbl values(#{uId},#{uName},#{uPhone},#{uSecondPhone},#{uThreePhone},#{uEmail},#{uPassword}," +
            "#{uRdcId},#{uABID},#{uIntegral}")
    public int insert();


    @Insert("update  net_ttbl set uName=#{uName},uPhone=#{uPhone},uSecondPhone=#{uSecondPhone},uThreePhone=#{uThreePhone}" +
            ",uEmail=#{uEmail},uPassword#{uPasswor=d},uRdcId=#{uRdcId},uABID=#{uABID},uIntegral=#{uIntegral} where id=#{id}")
    public int update(TTBL ttbl);



    @Delete("delete from net_ttbl where id=#{id}")
    public int delete(int id);
}
