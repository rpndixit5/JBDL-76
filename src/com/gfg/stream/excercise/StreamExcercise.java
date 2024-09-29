package com.gfg.stream.excercise;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExcercise {

    private static List<String> strings = List.of("apple", "adsasdsdgetgbrb", "sgrwgnhwytersvfrET", "ghwrbrwsdeftesabr", "faergbvteqgva","otto");


    public static void main(String[] args) {


        List out = strings.stream().map(str -> str.length() > 10 ? str.substring(0, 10) : str).filter(str -> str.charAt(0) == str.charAt(str.length()-1)).collect(Collectors.toList());

        System.out.println(out);
    }
}
