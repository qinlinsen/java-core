package com.timo.reflect.annotatedArrayType;

import java.util.Arrays;

/**
 * @author qinlinsen
 */
public class Test100 {
    public static void main(String[] args) {
        Student[] students = new Student[1];
        Student[] students1 = Arrays.copyOf(students, 2 * students.length);
        System.out.println("the students length is :"+students1.length);
        int[] a={1,2,3,4,5,6};
        int[] b={8,9,10,11};
        System.arraycopy(a,1,b,0,4);
       for(int i:b){
           System.out.println(i);
       }
    }
}
