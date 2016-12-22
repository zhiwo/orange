package com.eye.dao;

import com.eye.entity.LDB;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 光交箱
 */
@Mapper
public interface LdbDao {

    @Select(value = "select * from net_ldb")
    public List<LDB> getLDBList();

    @Insert(value = "insert into net_ldb values(#{ldb_id},#{ldbLongitude},#{ldbLatitude},#{ldbStatus},#{ldbAddress},#{ldbBsId})")
   // @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id") 获取自动增长ID
    public int insert(LDB ldb);


    @Update(value = "update net_ldb set ldbLongitude=#{ldbLongitude},ldbLatitude=#{ldbLatitude},ldbLatitude=#{ldbLatitude}," +
            "ldbAddress=#{ldbAddress} where id=#{id}")
    public int update(LDB ldb);


    @Delete(value = "delete from net_ldb where id=#{id}")
    public int delete(int id);
}
