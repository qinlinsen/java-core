package com.timo.immutableString;

/**
 * Objects of String class as immutable
 *
 * @author qinlinsen
 */
public class Immutable {

    public static void main(String[] args) {
        String greeting = "hell0";
        String help = greeting.substring(0, 3) + "p!";
        System.out.println(help);
        String a = "abc";
        String b = "abc";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        //true
        System.out.println(a == b);
        String abc = new String("abc");
        System.out.println(abc.hashCode());
        String abcd = new String("abc");
        //false
        System.out.println(abc == abcd);
        //空字符串的长度为0
        System.out.println("".length());
    }
}
