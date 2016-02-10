package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public String name;
        public int age;
        public int height;
        public int weight;
        public int fallosLenght;
        public int arms;
        public int legs;
        public int heads;
        public int asses;
        public boolean sex;
        public Human kids;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.age = age;
        }
        public Human(String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, int age, int weight, boolean sex){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }
        public Human(String name, int age, int weight, boolean sex, Human kids){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.kids = kids;
        }
        public Human(String name, int age, int weight, boolean sex, Human kids, int fallosLenght){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.kids = kids;
            this.fallosLenght = fallosLenght;
        }
        public Human(String name, int age, int weight, boolean sex, Human kids, int fallosLenght, int arms){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.kids = kids;
            this.fallosLenght = fallosLenght;
            this.arms = arms;
        }
        public Human(String name, int age, int weight, boolean sex, Human kids, int fallosLenght, int arms, int legs){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.kids = kids;
            this.fallosLenght = fallosLenght;
            this.arms = arms;
            this.legs = legs;
        }
        public Human(String name, int age, int weight, boolean sex, Human kids, int fallosLenght, int arms, int legs, int heads){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.kids = kids;
            this.fallosLenght = fallosLenght;
            this.arms = arms;
            this.legs = legs;
            this.heads = heads;
        }
        public Human(String name, int age, int weight, boolean sex, Human kids, int fallosLenght, int arms, int legs, int heads, int asses){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.kids = kids;
            this.fallosLenght = fallosLenght;
            this.arms = arms;
            this.legs = legs;
            this.heads = heads;
            this.asses = asses;
        }

//        public Human(int height){
//            this.height = height;
//        }
//        public Human(int weight){
//            this.weight = weight;
//        }
//        public Human(boolean sex){
//            this.sex = sex;
//        }
//        public Human(Human kids){
//            this.kids = kids;
//        }
//        public Human(String name, int age){
//            this.name = name;
//            this.age = age;
//        }
//        public Human(String name, int height){
//            this.name = name;
//            this.height = height;
//        }
//        public Human(String name, int weight){
//            this.name = name;
//            this.weight = weight;
//        }
//        public Human(String name, boolean sex, Human kids){
//            this.name = name;
//            this.name = name;
//            this.kids = kids;
//        }
    }
}
