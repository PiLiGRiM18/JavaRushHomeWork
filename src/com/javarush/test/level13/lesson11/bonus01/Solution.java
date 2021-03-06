package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        Scanner sc = new Scanner(new File(String.valueOf(scanner.nextLine())));

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        while (sc.hasNext()){
            int i = Integer.parseInt(sc.nextLine());
            if ((i % 2) == 0){
                treeSet.add(i);
            }
        }
        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
