package com.timo.reflect.annotatedArrayType;

public class Student {
    private String name;
    private Integer age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private Student() {
        System.out.println("I am student");
    }

    private Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void sayHi(String msg){
        System.out.println(msg);
    }
    private String sayHello(String msg){
       return msg;
    }
}
