package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Constructor;

public class StudentTest {
    public static void main(String[] args) throws Exception{
        //use reflection to create a student object of Student class
        Student student= (Student)Class.forName(Student.class.getName()).newInstance();
        System.out.println(student);
        Constructor<Student> studentConstructor = Student.class.getDeclaredConstructor(String.class);
        System.out.println(studentConstructor.isAccessible());
        if (!studentConstructor.isAccessible()) {
            studentConstructor.setAccessible(true);;
        }
        Student student1 = studentConstructor.newInstance("欧阳凤");
        System.out.println(student1.getName());
    }
}
