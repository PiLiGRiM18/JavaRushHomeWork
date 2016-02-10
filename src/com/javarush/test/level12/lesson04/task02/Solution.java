package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        s.print(1);
        Integer q = 3;
        s.print(q);
    }

    //Напишите тут ваши методы
    public void print(int i){
        System.out.println("int");
    }
    public void print(Integer j){
        System.out.println("Integer");
    }
}
