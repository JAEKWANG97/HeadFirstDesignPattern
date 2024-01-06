package ch01.duck_tryMyself.behavior.sound;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("아무 소리가 안납니다.");
    }
}
