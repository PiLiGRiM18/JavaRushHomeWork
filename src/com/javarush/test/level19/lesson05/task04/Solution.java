package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

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
        fileContent = fileContent.replaceAll("\\.", "!");
        fileWriter.write(fileContent);
        fileReader.close();
        fileWriter.close();
        scanner.close();
    }
}
