package com.timo.annotationProcessor;

import com.timo.annotation.Father;

/**
 * @author qinlinsen
 */

public class Qinwanli {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(new Qinwanli().name);
    }
}
