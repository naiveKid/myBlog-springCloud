package com.core.dao;

import com.model.PhotoAlbum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PhotoAlbumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhotoAlbum record);

    int insertSelective(PhotoAlbum record);

    PhotoAlbum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotoAlbum record);

    int updateByPrimaryKeyWithBLOBs(PhotoAlbum record);

    int updateByPrimaryKey(PhotoAlbum record);
}