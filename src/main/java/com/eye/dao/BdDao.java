package com.eye.dao;

import com.eye.entity.BD;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 宽带表
 */
@Mapper
public interface BdDao {
    @Select(value = "select * from net_bd")
    public List<BD> getBDList();

    @Insert(value = "insert into net_bd values(#{bdId},#{bdPwd},#{bdEmail},#{bdLongitude},#{bdLatitude},#{bdAddress}," +
            "#{bdUserId},#{bdLsId},#{bdStation},#{bdManagePwd},#{bdAB},#{bdDateTime},#{bdTimeLimi},#{bdDwUid},#{bdDwDate}," +
            "#{bdDwCause},#{bdTelLight},#{bdLosLight},#{bdPonLight},#{bdLanLight},#{bdPowerLight},#{bdFlexer},#{bdRemarks})")
    public int insert(BD bdInfo);

    @Update(value = "update net_bd set bdPwd=#{bdPwd},bdEmail=#{bdEmail},bdLongitude=#{bdLongitude},bdLatitude=#{bdLatitude}," +
            "bdAddress=#{bdAddress},bdStation=#{bdStation},bdManagePwd=#{bdManagePwd}," +
            "bdAB=#{bdAB},bdDateTime=#{bdDateTime},bdTimeLimi=#{bdTimeLimi},bdDwUid=#{bdDwUid},bdDwDate=#{bdDwDate},bdDwCause=#{bdDwCause}," +
            "bdTelLight=#{bdTelLight},bdLosLight=#{bdLosLight}," +
            "bdPonLight=#{bdPonLight},bdLanLight=#{bdLanLight},bdPowerLight=#{bdPowerLight},bdFlexer=#{bdFlexer},bdRemarks=#{bdRemarks}")
    public int update(BD bdInfo);


    @Delete(value = "delete from net_bd where id=#{id}")
    public  int delete(int id);

}
