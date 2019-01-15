package com.core.dao;

import com.model.LabelArticle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LabelArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabelArticle record);

    int insertSelective(LabelArticle record);

    LabelArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabelArticle record);

    int updateByPrimaryKey(LabelArticle record);
}