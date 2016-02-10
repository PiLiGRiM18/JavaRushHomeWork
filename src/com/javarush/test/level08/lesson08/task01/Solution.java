package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> list = new HashSet<String>();

        list.add("любовь");
        list.add("лох");
        list.add("лодка");
        list.add("люди");
        list.add("лопух");
        list.add("лицо");
        list.add("луна");
        list.add("ляпис");
        list.add("лофт");
        list.add("линия");
        list.add("ландыш");
        list.add("лурк");
        list.add("лапа");
        list.add("лень");
        list.add("лопата");
        list.add("лабаз");
        list.add("люмпен");
        list.add("лампа");
        list.add("ластик");
        list.add("лорд");

        return list;
    }
}
