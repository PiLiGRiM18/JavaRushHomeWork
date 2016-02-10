package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("q1", new Cat("Cat1"));
        map.put("q2", new Cat("Cat2"));
        map.put("q3", new Cat("Cat3"));
        map.put("q4", new Cat("Cat4"));
        map.put("q5", new Cat("Cat5"));
        map.put("q6", new Cat("Cat6"));
        map.put("q7", new Cat("Cat7"));
        map.put("q8", new Cat("Cat8"));
        map.put("q9", new Cat("Cat9"));
        map.put("q10", new Cat("Cat10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        HashSet<Cat> set = new HashSet<Cat>();



        for (Map.Entry<String, Cat> entry : map.entrySet()){
            set.add(entry.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
