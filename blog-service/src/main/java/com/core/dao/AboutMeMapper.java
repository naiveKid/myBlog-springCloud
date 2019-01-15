package com.core.dao;

import com.model.AboutMe;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AboutMeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AboutMe record);

    int insertSelective(AboutMe record);

    AboutMe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AboutMe record);

    int updateByPrimaryKeyWithBLOBs(AboutMe record);

    int updateByPrimaryKey(AboutMe record);
}