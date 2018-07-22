package com.timo.annotationProcessor;

/**
 * @author qinlinsen
 */
public class MotherTest {
    public static void main(String[] args) {
        MotherProcessor motherProcessor = new MotherProcessor();
        Wangbaoju wangbaoju = new Wangbaoju();
        motherProcessor.processor(wangbaoju);
        System.out.println(wangbaoju);
    }
}
