package com.pecuyu.fragmentinphoneandpad;

/**
 * Created by pecuyu on 2017/7/25.
 */

public class Info {
    private int id;
    private int age;
    private String name;

    public Info() {

    }

    public Info(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
