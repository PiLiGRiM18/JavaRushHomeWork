package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileRead1 = reader.readLine();
        String fileRead2 = reader.readLine();
        String fileRead3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileRead1);
        FileOutputStream file2 = new FileOutputStream(fileRead2);
        FileOutputStream file3 = new FileOutputStream(fileRead3);

//        int[] data = new int[file1.available()/2];
//        int[] data2 = new int[file1.available()/2];

        int filesize = file1.available() / 2;
        if (file1.available() % 2 !=0) filesize++;
        byte[] buffer = new byte[filesize];
        file1.read(buffer);
        file2.write(buffer);

        buffer = new byte[file1.available()];
        file1.read(buffer);
        file3.write(buffer);

        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
