package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.nextLine();
        FileOutputStream fileName1 = new FileOutputStream(file1);
        FileInputStream fileName2 = new FileInputStream(sc.nextLine());
        FileInputStream fileName3 = new FileInputStream(sc.nextLine());

        while (fileName2.available() > 0){
            fileName1.write(fileName2.read());
        }

        while (fileName3.available() > 0){
            FileOutputStream fileName11 = new FileOutputStream(file1, true);
            fileName11.write(fileName3.read());
            fileName11.close();
        }
        fileName1.close();
        fileName2.close();
        fileName3.close();
        sc.close();
    }
}
