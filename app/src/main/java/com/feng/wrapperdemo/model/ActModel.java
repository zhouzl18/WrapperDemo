package com.feng.wrapperdemo.model;

/**
 * Created by OneDay on 2017/6/6.
 *
 * Activity实体
 *
 */

public class ActModel {

    private String name;
    private Class t;

    public ActModel(String name, Class t) {
        this.name = name;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getT() {
        return t;
    }

    public void setT(Class t) {
        this.t = t;
    }
}
