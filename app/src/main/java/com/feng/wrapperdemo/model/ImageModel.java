package com.feng.wrapperdemo.model;

/**
 * Created by OneDay on 2017/6/6.
 *
 * Image实体
 *
 */

public class ImageModel {

    private String url;
    private String name;

    public ImageModel() {
    }

    public ImageModel(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
