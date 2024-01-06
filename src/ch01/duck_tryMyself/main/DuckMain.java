package ch01.duck_tryMyself.main;

import ch01.duck_tryMyself.model.duck.CustomDuck;
import ch01.duck_tryMyself.model.duck.MallardDuck;
import ch01.duck_tryMyself.model.hunter.DuckHunter;
import ch01.duck_tryMyself.model.hunter.Hunter;

public class DuckMain {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

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
