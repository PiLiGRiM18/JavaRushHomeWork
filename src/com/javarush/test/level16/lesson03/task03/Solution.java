package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread thread1 = new SpecialThread();
        Thread t1 = new Thread(thread1);
        SpecialThread thread2 = new SpecialThread();
        Thread t2 = new Thread(thread2);
        SpecialThread thread3 = new SpecialThread();
        Thread t3 = new Thread(thread3);
        SpecialThread thread4 = new SpecialThread();
        Thread t4 = new Thread(thread4);
        SpecialThread thread5 = new SpecialThread();
        Thread t5 = new Thread(thread5);

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
