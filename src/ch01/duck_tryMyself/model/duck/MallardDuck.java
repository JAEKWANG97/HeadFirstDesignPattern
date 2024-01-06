package ch01.duck_tryMyself.model.duck;

import ch01.duck_tryMyself.behavior.fly.FlyWithWings;
import ch01.duck_tryMyself.behavior.sound.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void swim() {
        System.out.println("물속을 헤엄쳐버리기");
    }

    @Override
    public void display() {
        System.out.println("나는 물오리닷");
    }
}
