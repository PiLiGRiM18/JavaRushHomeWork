package com.javarush.test.level11.lesson06.task03;

/* В гостях у бабушки
Написать шесть классов: Animal (животное), Cow(корова) и Pig(свинья), Sheep(овца), Bull(бык), Goat(козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Animal
    {
    int weight;
    }

    public class Cow extends Animal
    {
    String voice = "qwe";
    }

    public class Pig extends Animal
    {
        String voice = "asd";
    }

    public class Sheep extends Animal
    {
        String voice = "zxc";
    }

    public class Bull extends Animal
    {
        String voice = "ewre";
    }

    public class Goat extends Animal
    {
        String voice = "sdf";
    }

}
