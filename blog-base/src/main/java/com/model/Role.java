package com.model;

/**
 * 角色表
 */
public class Role {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 选项值
     */
    private String option;

    /**
     * 角色描述
     */
    private String describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}