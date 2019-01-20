package com.model;

import java.util.Date;

/**
 * 文章表
 */
public class Article {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 文章分类id
     */
    private Integer articleClassificationId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章简述
     */
    private String sketch;

    /**
     * 文章作者用户id
     */
    private Integer author;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 阅读数
     */
    private Integer readNum;

    /**
     * 点赞数
     */
    private Integer goodNum;

    /**
     * 排序
     */
    private Integer order;

    /**
     * 文章内容
     */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleClassificationId() {
        return articleClassificationId;
    }

    public void setArticleClassificationId(Integer articleClassificationId) {
        this.articleClassificationId = articleClassificationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch == null ? null : sketch.trim();
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}