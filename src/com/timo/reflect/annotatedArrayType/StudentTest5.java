package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

public class StudentTest5 {
    public static void main(String[] args) throws Exception{
      /*  Student student = new Student("ouyangfeng");
        Class<? extends Student> aClass = student.getClass();
        Field name = aClass.getDeclaredField("name");
        if(! name.isAccessible()){
            name.setAccessible(true);
            Object o = name.get(student);
            System.out.println("o="+o);
        }*/
      //全部用反射做：
        Class<Student> studentClass = Student.class;
        Constructor<Student> studentConstructor = studentClass.getDeclaredConstructor(String.class);
        if(! studentConstructor.isAccessible()){
            studentConstructor.setAccessible(true);
        }
        Student student = studentConstructor.newInstance("ouyangfeng");
        //得到name这个字段
        Field name = studentClass.getDeclaredField("name");
        if(!name.isAccessible()){
            name.setAccessible(true);
        }
        //得到name的值：相当于调用：student.getName();
        Object o = name.get(student);
        if(o instanceof String){
            System.out.println("the name is :"+o);
        }

    }
}
