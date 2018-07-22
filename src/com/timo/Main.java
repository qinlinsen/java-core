package com.timo;

/**
 * @author qinlinsen
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        /**
         * 每个元素用指定的分隔符隔开
         * 本示例的运行结果是：join=m/y/n/e
         */
        String join = String.join("/", "m", "y", "n", "e");
        System.out.println("join="+join);
    }
}
