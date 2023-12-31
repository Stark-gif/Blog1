package com.blog1;

import java.util.function.Function;

public class A {
    public static void main(String[] args) {
        Function<Integer, String> fr = i -> "result:" +i;
        String val = fr.apply(100);
System.out.println(val);
    }
}