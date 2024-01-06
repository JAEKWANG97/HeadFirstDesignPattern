package ch01.duck_tryMyself.behavior.sound;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
