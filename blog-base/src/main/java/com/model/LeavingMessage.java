package com.model;

import java.util.Date;

/**
 * 留言表
 */
public class LeavingMessage {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 留言者姓名
     */
    private String name;

    /**
     * 留言者email
     */
    private String email;

    /**
     * 留言时间
     */
    private Date createTime;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 留言回复内容
     */
    private String answerContent;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }
}