package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandPa1Dima = new Human("Дима", true, 60, null, null);
        Human grandMa1Olya = new Human("Оля", false, 50, null, null);
        Human grandPa2Misha = new Human("Миша", true, 50, null, null);
        Human grandMa2Nina = new Human("Нина", false, 50, null, null);
        Human fatherSasha = new Human("Саша", true, 35, grandPa1Dima, grandMa1Olya);
        Human motherMasha = new Human("Маша", false, 35, grandPa2Misha, grandMa2Nina);
        Human kidVasya = new Human("Вася", true, 23, fatherSasha, motherMasha);
        Human kidZhenya = new Human("Женя", true, 23, fatherSasha, motherMasha);
        Human kidKatya = new Human("Катя", false, 23, fatherSasha, motherMasha);

        System.out.println(grandPa1Dima);
        System.out.println(grandMa1Olya);
        System.out.println(grandPa2Misha);
        System.out.println(grandMa2Nina);
        System.out.println(fatherSasha);
        System.out.println(motherMasha);
        System.out.println(kidVasya);
        System.out.println(kidZhenya);
        System.out.println(kidKatya);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
