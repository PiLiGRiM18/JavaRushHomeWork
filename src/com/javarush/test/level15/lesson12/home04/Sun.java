package com.javarush.test.level15.lesson12.home04;

/**
 * Created by piligrim on 15.12.2015.
 */
public class Sun implements Planet{
    private static Sun instance;
    Sun() {
    }
    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }


}
