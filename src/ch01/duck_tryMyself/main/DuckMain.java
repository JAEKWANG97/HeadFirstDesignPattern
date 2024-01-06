package ch01.duck_tryMyself.main;

import ch01.duck_tryMyself.behavior.fly.FlyNoWay;
import ch01.duck_tryMyself.behavior.sound.Quack;
import ch01.duck_tryMyself.model.duck.CustomDuck;
import ch01.duck_tryMyself.model.duck.MallardDuck;
import ch01.duck_tryMyself.model.hunter.DuckHunter;
import ch01.duck_tryMyself.model.hunter.Hunter;

public class DuckMain {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println();

        System.out.println();

        CustomDuck customDuck = new CustomDuck();
        customDuck.performFly();
        customDuck.performQuack();
        customDuck.swim();
        customDuck.display();

        Hunter hunter = new DuckHunter();
        hunter.lure();
        hunter.shot();
    }
}
