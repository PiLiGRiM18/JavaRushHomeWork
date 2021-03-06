package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        for (Cat cat : cats)
        {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> set = new HashSet<Cat>();
        set.add(new Cat("qwe"));
        set.add(new Cat("asd"));
        set.add(new Cat("zxc"));
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

    private static class Cat {
        String name;
        public Cat(String name)
        {
            this.name = name;
        }
    }
}
