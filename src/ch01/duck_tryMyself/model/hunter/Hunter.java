package ch01.duck_tryMyself.model.hunter;

import ch01.duck_tryMyself.behavior.sound.QuackBehavior;

public abstract class Hunter {
    QuackBehavior quackBehavior;

    public Hunter(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void shot();

    public void lure(){
        System.out.print("사냥꾼이 유인하기 위해 소리를 냅니다..!");
        quackBehavior.quack();
    }
}
