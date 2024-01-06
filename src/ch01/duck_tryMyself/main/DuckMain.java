package ch01.duck_tryMyself.main;

import ch01.duck_tryMyself.model.CustomDuck;
import ch01.duck_tryMyself.model.MallardDuck;

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
    }
}
