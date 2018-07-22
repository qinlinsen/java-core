package com.timo.annotation;

import java.lang.annotation.*;

/**
 * @author qinlinsen
 */
@Target({ElementType.ANNOTATION_TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Mother {
    String name() default "王宝菊";
}
