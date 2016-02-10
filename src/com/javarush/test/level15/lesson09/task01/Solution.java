package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
//        Map<Long, String> labels = new HashMap<Long, String>();
//        Map<Integer, String> labels = new HashMap<Integer, String>();
//        Map<Float, String> labels = new HashMap<Float, String>();
//        Map<Long, Float> labels = new HashMap<Long, Float>();
//        Map<Long, Integer> labels = new HashMap<Long, Integer>();
        labels.put((double) 12, "qwe");
        labels.put((double) 22, "dwe");
        labels.put((double) 32, "fwe");
        labels.put((double) 42, "gwe");
        labels.put((double) 52, "hwe");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
