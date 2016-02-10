package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by piligrim on 16.12.2015.
 */
public class Plane implements Flyable {

    int passengersCount;

    @Override
    public void fly() {

    }

    public Plane(int passengers){
        this.passengersCount = passengers;
    }
}
