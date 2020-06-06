package com.itstep.sixapplication.ex_007_add_data;


public class People {

    private int age;
    private String name;
    private String position;

    public People(int age, String name, String position) {
        this.age = age;
        this.name = name;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

}
