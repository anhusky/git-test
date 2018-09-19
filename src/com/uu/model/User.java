package com.uu.model;

/**
 * 描述：
 *
 * @author liupenghao
 * @create 2018-09-18 下午6:47
 **/
public class User {
    private String name;
    private String description;
    private Integer age;
    private Integer score;
    private Integer top;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
