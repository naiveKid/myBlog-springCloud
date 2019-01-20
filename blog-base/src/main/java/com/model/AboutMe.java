package com.model;

/**
 * 关于我
 */
public class AboutMe {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 缩略图id
     */
    private Integer thumbnail;

    /**
     * 简介(纯文本)
     */
    private String sketch;

    /**
     * 内容(html)
     */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Integer thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch == null ? null : sketch.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}