package com.timo.annotationProcessor;

import com.timo.annotation.Mother;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @author qinlinsen
 */
public class MotherProcessor {
    public void processor(Wangbaoju annotation){
        Field[] fields = annotation.getClass().getDeclaredFields();
        for(Field field:fields){
            //@Mother这个注解是否在类Wangbaoju类中的字段上，在的话就返回true，否则返回false
            boolean isMotherPresent = field.isAnnotationPresent(Mother.class);
            //得到@Mother这个注解
            if (isMotherPresent) {
                Mother motherAnnotation = field.getAnnotation(Mother.class);
                Objects.requireNonNull(annotation);
                annotation.setName(motherAnnotation.name());
            }
        }
    }
}
