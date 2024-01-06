package ch01.duck_tryMyself.behavior.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날개짓을 합니다.");
    }
}
