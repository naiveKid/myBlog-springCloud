package com.model;

/**
 * 相册集表
 */
public class PhotoAlbum {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 相册集标题
     */
    private String title;

    /**
     * 相册集描述
     */
    private String describe;

    /**
     * 相册缩略图id
     */
    private Integer thumbnail;

    /**
     * 相册简介
     */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Integer thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}