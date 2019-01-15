package com.core.dao;

import com.model.ArticleClassification;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleClassificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleClassification record);

    int insertSelective(ArticleClassification record);

    ArticleClassification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleClassification record);

    int updateByPrimaryKey(ArticleClassification record);
}