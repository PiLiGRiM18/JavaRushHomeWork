package com.javarush.test.level13.lesson11.bonus03;

public class Robot extends AbstractRobot implements Attackable, Defensable
{


    public Robot(String name) {
        super(name);
    }

    @Override
    public BodyPart attack() {
        return super.attack();
    }

    @Override
    public BodyPart defense() {
        return super.attack();
    }
}
