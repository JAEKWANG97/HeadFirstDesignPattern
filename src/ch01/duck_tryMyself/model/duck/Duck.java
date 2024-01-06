package ch01.duck_tryMyself.model.duck;

import ch01.duck_tryMyself.behavior.fly.FlyBehavior;
import ch01.duck_tryMyself.behavior.sound.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    abstract void swim();

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

}
