package com.timo.reflect.annotatedArrayType;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        System.out.println(new Test().getClass().getName());
        System.out.println(Class.forName("java.util.ArrayList").getName());
        System.out.println(new Test().getClass()==Test.class);
        System.out.println(Test.class==Class.forName(new Test().getClass().getName()));
        System.out.println(int.class);
        System.out.println(Test.class instanceof Class<?>);
        //for historical reasons,the getName method returns somewhat strange names for array types
        System.out.println(int[].class.getName());

    }
}
