package com.model;

public class Photo {
    private Integer id;

    private Integer album;

    private String describe;

    private Integer upfileId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbum() {
        return album;
    }

    public void setAlbum(Integer album) {
        this.album = album;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getUpfileId() {
        return upfileId;
    }

    public void setUpfileId(Integer upfileId) {
        this.upfileId = upfileId;
    }
}