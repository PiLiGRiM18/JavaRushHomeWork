package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> mapTmp = new HashMap<String, String>();
        mapTmp.put("1Фамилия", "1Имя");
        mapTmp.put("2Фамилия", "Имя");
        mapTmp.put("Фамилия", "3Имя");
        mapTmp.put("4Фамилия", "4Имя");
        mapTmp.put("5Фамилия", "5Имя");
        mapTmp.put("6Фамилия", "Имя");
        mapTmp.put("Фамилия", "7Имя");
        mapTmp.put("8Фамилия", "8Имя");
        mapTmp.put("9Фамилия", "9Имя");
        mapTmp.put("10Фамилия", "10Имя");
        return mapTmp;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
