package ch01.duck_tryMyself.model;

import ch01.duck_tryMyself.behavior.fly.FlyNoWay;
import ch01.duck_tryMyself.behavior.sound.MuteQuack;

public class CustomDuck extends Duck {


    public CustomDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void swim() {
        System.out.println("커스텀 덕이 수영합니다.");
    }

    @Override
    public void display() {
        System.out.println("커스텀 덕이다!");
    }
}
