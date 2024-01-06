package ch01.duck_tryMyself.behavior.sound;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
