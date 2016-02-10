package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();


        ArrayList<String> list = new ArrayList<>();



        while (true){
            String buffer = reader.readLine();
            list.add(buffer);
            if (buffer.equals("exit")) break;
        }

        OutputStream outStream = new FileOutputStream(fileName);

        for (int i = 0; i < list.size(); i++){
            outStream.write(list.get(i).getBytes());
            outStream.write(System.lineSeparator().getBytes());
        }

        outStream.close();
        //reader.close();
    }
}
