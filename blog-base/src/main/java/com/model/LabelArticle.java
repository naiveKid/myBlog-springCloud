package com.model;

/**
 * 标签、文章关系表
 */
public class LabelArticle {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标签id
     */
    private Integer labelId;

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

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}