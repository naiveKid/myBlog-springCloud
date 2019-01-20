package com.model;

import java.util.Date;

/**
 * 评价表
 */
public class Evaluate {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 评价人姓名
     */
    private String name;

    /**
     * 评价时间
     */
    private Date createTime;

    /**
     * 评价内容
     */
    private String content;

    /**
     * 评价类型(0:相册1:文章)
     */
    private Integer evaluateType;

    /**
     * 回复内容
     */
    private String answerContent;

    /**
     * 文章id
     */
    private Integer articleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getEvaluateType() {
        return evaluateType;
    }

    public void setEvaluateType(Integer evaluateType) {
        this.evaluateType = evaluateType;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}