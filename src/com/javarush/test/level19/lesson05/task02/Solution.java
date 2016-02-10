package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(br.readLine());
        String result = "";
        int count = 0;
        while (reader.ready()){
            result += String.valueOf((char) reader.read());
        }

        result = result.replaceAll("\\p{Punct}", " ");

        String[] array1 = result.split("\n");

        for (String s : array1){
            String[] array2 = s.split(" ");

            for (String s2 : array2){
                if (s2.equals("world")){
                    count++;
                }
            }
        }

        System.out.println(count);
        reader.close();
        br.close();
    }
}
