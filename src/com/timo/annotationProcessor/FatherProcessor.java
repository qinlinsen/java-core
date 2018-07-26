package com.timo.annotationProcessor;

import com.timo.annotation.Mother;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Set;

/**
 * @author qinlinsen
 */
public class FatherProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return true;
    }
}
