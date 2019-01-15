package com.core.dao;

import com.model.Upfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpfileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Upfile record);

    int insertSelective(Upfile record);

    Upfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Upfile record);

    int updateByPrimaryKey(Upfile record);
}