package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<String, Integer> mapAng = new HashMap<String, Integer>();
        mapAng.put("January", 1);
        mapAng.put("February", 2);
        mapAng.put("March", 3);
        mapAng.put("April", 4);
        mapAng.put("May", 5);
        mapAng.put("June", 6);
        mapAng.put("July", 7);
        mapAng.put("August", 8);
        mapAng.put("September", 9);
        mapAng.put("October", 10);
        mapAng.put("November", 11);
        mapAng.put("December", 12);

        for (Map.Entry<String, Integer> pair : mapAng.entrySet()){
            if (month.equals(pair.getKey())){
                System.out.println(pair.getKey() + " is " + pair.getValue() + " month");
            }
        }


    }



}
