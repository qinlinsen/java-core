package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Method;

public class StudentTest2 {
    public static void main(String[] args)  throws Exception{
        Class<?> studentClass = Class.forName(Student.class.getName());
        Class<?> name = studentClass.getDeclaredField("name").getType();
        System.out.println(name);
        Method setName = studentClass.getDeclaredMethod("getName", new Class[]{});
        System.out.println(setName.getReturnType());
        System.out.println(Package.getPackage("java.lang").getName());
        System.out.println("abc a".lastIndexOf("a"));
    }
}
