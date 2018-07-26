package com.timo.reflect.annotatedArrayType;

import com.timo.reflect.Frod;
import com.timo.reflect.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author qinlinsen
 */
public class FrodTest {
    public static void main(String[] args) throws Exception{
        Class<Frod> frodClass = Frod.class;
        Method method = frodClass.getDeclaredMethod("sayHi");
        boolean aPublic = Modifier.isPublic(method.getModifiers());
        Class<?> declaringClass = method.getDeclaringClass();
        int modifiers = declaringClass.getModifiers();
        System.out.println("aPublic="+aPublic);
        System.out.println("modifiers="+modifiers);
        boolean accessible = method.isAccessible();
        System.out.println("accessible="+accessible);
        ReflectionUtils.makeAccessible(method);
        Frod frod = frodClass.newInstance();
        method.invoke(frod);
    }
}
