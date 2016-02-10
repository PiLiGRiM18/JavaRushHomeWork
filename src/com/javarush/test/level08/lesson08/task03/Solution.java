package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("q", "a");
        map.put("w", "a");
        map.put("e", "a");
        map.put("r", "s");
        map.put("t", "s");
        map.put("y", "d");
        map.put("u", "f");
        map.put("i", "g");
        map.put("o", "h");
        map.put("p", "j");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getValue();
            if (key.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String value = pair.getKey();
            if (value.equals(familiya)) count++;
        }
        return count;

    }

    public static void main (String[] args)
    {
        HashMap<String, String> map1 = createMap();
        System.out.println(getCountTheSameFirstName(map1, "e"));
        System.out.println(getCountTheSameLastName(map1, "a"));
    }
}
