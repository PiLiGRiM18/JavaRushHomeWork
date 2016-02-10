package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        for (String arg : args){
//            System.out.println(arg);
//        }


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;

        while (inputStream.available() > 0){
            int temp = inputStream.read();

            for (int i = 65; i <= 90; i++) {
                if (temp == (char) i) {
                    count++;
                }
            }
            for (int i = 97; i <= 122; i++) {
                if (temp == (char) i) {
                    count++;
                }
            }
        }
        System.out.println(count);
//        reader.close();
        inputStream.close();
    }
}
