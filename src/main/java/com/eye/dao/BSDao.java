package com.eye.dao;

import com.eye.entity.BS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by holdlg on 2016/11/23.
 */
@Mapper
public interface BSDao {

    @Select(value = "select * from net_bs")
    public List<BS> findAllBSList();

    @Select(value = "select * from net_bs where bs_id=#{bsId}")
    public void getBS(@Param("bsId") String bsId);
}
