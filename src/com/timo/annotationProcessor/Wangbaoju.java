package com.timo.annotationProcessor;

import com.timo.annotation.Mother;

/**
 * @author qinlinsen
 */
public class Wangbaoju {
    @Mother
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "my mother name is :"+name;
    }
}
