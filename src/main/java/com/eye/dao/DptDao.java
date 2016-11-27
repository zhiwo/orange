package com.eye.dao;

import com.eye.entity.DPT;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 代维人员表
 */
@Mapper
public interface DptDao {

    @Select(value = "select * from net_dpt")
    public List<DPT> getDptList();



    @Insert(value = "insert into net_dpt values(#{dptName},#{dptPhone},#{dptName},#{dptCode},#{dptPower},#{dptEducation}," +
            "#{dptPassword},#{dptGraduateSchool},#{dptHireDate},#{dptLeaveDate},#{dptState},#{dptSecondP},#{dptSpPhone}," +
            "#{dptThreeP},#{dptTpPhone},#{dptBrithDay})")
    public int insert(DPT dptInfo);



    @Update(value = "update net_dpt set dptName=#{dptName},dptPhone=#{dptPhone},dptName=#{dptName},dptCode=#{dptCode},dptPower=#{dptPower}," +
            "dptEducation=#{dptEducation},dptPassword=#{dptPassword},dptGraduateSchool=#{dptGraduateSchool},dptHireDate=#{dptHireDate}," +
            "dptLeaveDate=#{dptLeaveDate},dptState=#{dptState},dptSecondP=#{dptSecondP},dptSpPhone=#{dptSpPhone}," +
            "dptThreeP=#{dptThreeP},dptTpPhone=#{dptTpPhone},dptBrithDay=#{dptBrithDay} where id=#{id}")
    public int update(DPT dptInfo);


    @Delete(value = "delete from net_dpt where id=#{id}")
    public int delete(int id);
}
