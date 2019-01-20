package com.model;

/**
 * 标签表
 */
public class Label {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标签名
     */
    private String name;

    /**
     * 显示顺序
     */
    private Integer order;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}