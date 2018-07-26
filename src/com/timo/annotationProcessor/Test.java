package com.timo.annotationProcessor;

import com.timo.reflect.annotatedArrayType.Student;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws Exception{
        Class<Qinwanli> qinwanliClass = Qinwanli.class;
        Type returnType = qinwanliClass.getDeclaredMethod("getName").getGenericReturnType();
        if (returnType instanceof  Class) {
            System.out.println("return type is :"+returnType);
        }
        int[] a={1,2,3,4,5,6};
        int[] b={8,9,10};
        //改变b的值
        System.arraycopy(a,1,b,0,3);
        for(int i:b){
            System.out.println("i="+i);
        }
        Student[] students = new Student[100];
        Object[] students1 = students;
        System.out.println(students1);
        System.out.println((Student[])students1);
        Object[] objects = new Object[100];
//        System.out.println((Student[])objects);
        System.out.println(Array.getLength(students));
        Object o = Array.get(a, 0);
        if(o instanceof Integer){
            System.out.println("0 is "+o);
        }
        System.out.println((Object)b);

        boolean array = students.getClass().isArray();
        System.out.println("array="+array);
        //创建一个student对象
        Class<Student> studentClass = Student.class;
        Constructor<Student> studentConstructor = studentClass.getDeclaredConstructor();
        if (!studentConstructor.isAccessible()) {
            studentConstructor.setAccessible(true);
        }
        Student student = studentConstructor.newInstance();
        System.out.println(student.getClass().isArray());
        Field name = studentClass.getDeclaredField("name");
        if(! name.isAccessible()){
            name.setAccessible(true);
        }
        name.set(student,"欧阳凤");
        Method getName =studentClass.getDeclaredMethod("getName");
        Object ouyangfeng = getName.invoke(student);
        System.out.println("ouyangfeng name is :"+ouyangfeng);
    }
}
