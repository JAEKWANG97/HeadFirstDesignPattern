package ch01.duck_tryMyself.model.hunter;

import ch01.duck_tryMyself.behavior.sound.Quack;
import ch01.duck_tryMyself.behavior.sound.QuackBehavior;
import ch01.duck_tryMyself.behavior.sound.Squeak;

public class DuckHunter extends Hunter{

    public DuckHunter() {
        super(new Squeak());
    }

    @Override
    public void shot() {
        System.out.println("빵!");
    }

}
