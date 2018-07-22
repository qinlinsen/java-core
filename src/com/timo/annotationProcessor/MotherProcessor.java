package com.timo.annotationProcessor;

import com.timo.annotation.Mother;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * 当开发者使用了Annotation修饰类、方法、Filed等成员之后，这些Annotation不会自己生效，必须由开发者提供相应
 * 的代码来提取并处理Annotation的信息。这些处理提取和处理Annotation的代码统称为APT即Annotation Processing Tool.
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
                //得到这个字段上的注解类@Mother
                Mother motherAnnotation = field.getAnnotation(Mother.class);
                Objects.requireNonNull(annotation);
                annotation.setName(motherAnnotation.name());
            }
        }
    }
}
