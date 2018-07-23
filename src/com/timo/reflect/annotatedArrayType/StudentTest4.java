package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StudentTest4 {
    //getMethods与getDeclaredMethod的区别
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        Method[] methods = studentClass.getMethods();
        for(Method method:methods){
            System.out.println("method name is :"+method.getName());
        }
       for (Field field:studentClass.getDeclaredFields()){
       }
        System.out.println("************************");
        for(Method method:studentClass.getDeclaredMethods()){

           if(method.getModifiers()==Modifier.PRIVATE){
                System.out.println("private");
            }else{
                if(method.getModifiers()==Modifier.PUBLIC){}
                System.out.println("public");
            }
            System.out.println("the declared method name is :"+method.getName());
        }
    }
}
