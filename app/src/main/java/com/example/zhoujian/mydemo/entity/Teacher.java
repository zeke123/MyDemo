/*
 * Copyright (c) 2016. 周建的版权信息
 */

package com.example.zhoujian.mydemo.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zhoujian on 16/7/27.
 */
public class Teacher implements Parcelable {

    private String name;
    private int age;
    private String password;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeString(this.password);
    }

    public Teacher() {
    }

    protected Teacher(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<Teacher> CREATOR = new Parcelable.Creator<Teacher>() {
        @Override
        public Teacher createFromParcel(Parcel source) {
            return new Teacher(source);
        }

        @Override
        public Teacher[] newArray(int size) {
            return new Teacher[size];
        }
    };
}
