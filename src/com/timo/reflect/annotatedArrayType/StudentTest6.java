package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author qinlinsen
 */
public class StudentTest6 {
    public static void main(String[] args) throws Exception{
        Class<Student> studentClass = Student.class;
        Constructor<Student> studentConstructor = studentClass.getDeclaredConstructor();
        if(! studentConstructor.isAccessible()){
            studentConstructor.setAccessible(true);
        }
        Student student = studentConstructor.newInstance();
        Field salary = studentClass.getDeclaredField("salary");
        if(! salary.isAccessible()){
            salary.setAccessible(true);
        }
        salary.set(student,1.02);
        System.out.println(salary.get(student));
        if(salary.get(student) instanceof Double){
            System.out.println("yes");
        }else {
            System.out.println("no ");
        }
    }
}
