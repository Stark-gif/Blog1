package com.blog1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil {
    public static void main(String[] args) {



        List<Double> list = Arrays.asList(10.0,20.0,5.0,2.0,36.0,17.0);
        List<Double> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.size());

    }
}
