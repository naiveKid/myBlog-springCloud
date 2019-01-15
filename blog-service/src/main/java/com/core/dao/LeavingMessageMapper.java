package com.core.dao;

import com.model.LeavingMessage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeavingMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeavingMessage record);

    int insertSelective(LeavingMessage record);

    LeavingMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeavingMessage record);

    int updateByPrimaryKey(LeavingMessage record);
}