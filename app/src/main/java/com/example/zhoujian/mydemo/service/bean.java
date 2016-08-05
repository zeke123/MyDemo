/*
 * Copyright (c) 2016. 周建的版权信息
 */

package com.example.zhoujian.mydemo.service;

/**
 * Created by zhoujian on 16/7/26.
 */
public class bean {


    public bean(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        bean bean = (bean) o;

        if (age != bean.age) return false;
        return name != null ? name.equals(bean.name) : bean.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
