package com.eye.dao;

import com.eye.entity.BS;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by holdlg on 2016/11/23.
 */
@Mapper
public interface BsDao {

    @Select(value = "select * from net_bs")
    public List<BS> findAllBSList();

    @Select(value = "select * from net_bs where bs_id=#{bsId}")
    public void getBS(String bsId);



    @Insert(value = "insert into net_bs values(#{bsId},#{bsName},#{bsPingYin},#{bsLongitude},#{bsLatitude},#{bsStatus},#{bsAddress})")
    public void insert(BS bsInfo);

    @Delete(value = "delete from net_bs where id=#{id}")
    public int delete(int id); //@param 当参数只有一个可以不要，多个需要


    @Update(value = "update net_bs set bsName=#{bsName},bsPingYin=#{bsPingYin},bsLongitude=#{bsLongitude},bsLatitude=#{bsLatitude},bsStatus=${bsStatus},bsAddress=${bsAddress} where id=#{id}")
    public int update(BS bsInfo);


}