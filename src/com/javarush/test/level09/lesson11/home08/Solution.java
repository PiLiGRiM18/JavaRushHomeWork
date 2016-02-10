package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list2 = new ArrayList<int[]>();
        int[] five = {1, 2, 3, 4, 5};
        //int[] five = new int[5];
        int[] two = {1, 2};
        int[] for1 = {1, 2, 3, 4};
        int[] seven = {1, 2, 3, 4, 5, 6, 7};
        int[] zero = {};

        list2.add(five);
        list2.add(two);
        list2.add(for1);
        list2.add(seven);
        list2.add(zero);
        return list2;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
