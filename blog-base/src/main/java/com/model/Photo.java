package com.model;

/**
 * 相册
 */
public class Photo {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 所属相册集id
     */
    private Integer album;

    /**
     * 相片描述
     */
    private String describe;

    /**
     * 文件表id
     */
    private Integer upfileId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbum() {
        return album;
    }

    public void setAlbum(Integer album) {
        this.album = album;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getUpfileId() {
        return upfileId;
    }

    public void setUpfileId(Integer upfileId) {
        this.upfileId = upfileId;
    }
}