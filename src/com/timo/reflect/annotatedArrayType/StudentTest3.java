package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Constructor;

public class StudentTest3 {
    public static void main(String[] args) throws Exception{
        Class<Student> studentClass = Student.class;
        Constructor<Student> studentConstructor = studentClass.getDeclaredConstructor(String.class);
        //如果这个构造方法是private的话，那么给他赋予一个访问权限
        if (! studentConstructor.isAccessible()) {
            studentConstructor.setAccessible(true);
        }
        //创建对象
        Student student = studentConstructor.newInstance("欧阳凤");
        //用反射调用这个对象的方法：
        Object name = studentClass.getDeclaredMethod("getName").invoke(student);
        System.out.println(name);
        studentClass.getDeclaredMethod("sayHi", String.class).invoke(student,"hello world");
    }
}
