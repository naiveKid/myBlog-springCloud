package com.core.dao;

import com.model.Label;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LabelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Label record);

    int insertSelective(Label record);

    Label selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);
}