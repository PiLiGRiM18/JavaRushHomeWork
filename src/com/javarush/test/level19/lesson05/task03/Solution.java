package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileReader fileReader = new FileReader(scanner.nextLine());
        FileWriter fileWriter = new FileWriter(scanner.nextLine());
        String fileContent = "";
        String result = "";
        while (fileReader.ready()){
            fileContent += String.valueOf((char) fileReader.read());
        }

        fileContent = fileContent.replaceAll("\n|\r\n", " ");
//        fileContent = fileContent.replaceAll("\\p{Punct}", "");
//        String[] array1 = fileContent.split("\n");

        String[] array = fileContent.split(" ");

        for (int i = 0; i < array.length; i++){
            if (checkString(array[i]) == true){
//                System.out.println(array[i]);
                result = result + array[i] +" ";
        }
//            System.out.printf(array[i] + " ");

            }
        fileWriter.write(result);
        fileReader.close();
        fileWriter.close();
        scanner.close();
//        System.out.println(result);
    }

    public static boolean checkString(String string){
        try {
            Integer.parseInt(string);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}
