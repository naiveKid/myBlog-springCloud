package com.model;

/**
 * 附件表
 */
public class Upfile {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 文件路径
     */
    private String filePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
}