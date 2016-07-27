/*
 * Copyright (c) 2016. 周建的版权信息
 */

package com.example.zhoujian.mydemo.service;

/**
 * Created by zhoujian on 16/7/26.
 */
public class bean {



    private  int age;

    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {

        return "bean{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
