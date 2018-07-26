package com.timo.annotation;

import com.timo.reflect.annotatedArrayType.TanFucheng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TanTest {
    public static void main(String[] args) throws Exception{
//        TanFucheng tanFucheng = new TanFucheng("eiow");
        Class<TanFucheng> tanFuchengClass = TanFucheng.class;
        //use reflection to new instance
        Constructor<TanFucheng> declaredConstructor = tanFuchengClass.getDeclaredConstructor(String.class);
        if (! declaredConstructor.isAccessible()) {
           declaredConstructor.setAccessible(true);
        }
        TanFucheng tanFucheng = declaredConstructor.newInstance("谭福成");
        Method method = tanFuchengClass.getDeclaredMethod("printName");
        if(!method.isAccessible()){
            method.setAccessible(true);
        }
        Object invoke = method.invoke(tanFucheng);
    }
}
