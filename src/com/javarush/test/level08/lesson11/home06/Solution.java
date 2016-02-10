package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Map;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();
        //дети
        Human child1 = new Human("child1", true, 3, new ArrayList<Human>());
        children.add(child1);
        Human child2 = new Human("child1", false, 3, new ArrayList<Human>());
        children.add(child2);
        Human child3 = new Human("child1", true, 3, new ArrayList<Human>());
        children.add(child3);

        //родители
        ArrayList<Human> mamaList = new ArrayList<Human>();
        Human mama = new Human("mama", false, 30, children);
        mamaList.add(mama);

        ArrayList<Human> papaList = new ArrayList<Human>();
        Human papa = new Human("papa", true, 35, children);
        papaList.add(papa);

        //бабушки.дедушки
        Human grandMa1 = new Human("babka1", false, 70, papaList);
        Human grandMa2 = new Human("babka2", false, 70, mamaList);
        Human grandPa1 = new Human("ded1", true, 70, papaList);
        Human grandPa2 = new Human("ded2", true, 70, mamaList);

        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(children.get(0));
        System.out.println(children.get(1));
        System.out.println(children.get(2));


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
