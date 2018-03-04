package com.my.advance4;

import java.util.List;

public class InjectBean2 implements InjectBeanInterface {

    private String title;
    private int age;
    List<String> list;

    public List<String> getList() {
        return list;
    }


    public void setList(List<String> list) {
        this.list = list;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
