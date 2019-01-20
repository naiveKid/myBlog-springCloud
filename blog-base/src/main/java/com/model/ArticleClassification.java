package com.model;

/**
 * 文章分类表
 */
public class ArticleClassification {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String classificationName;

    /**
     * 排序
     */
    private Integer order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName == null ? null : classificationName.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}