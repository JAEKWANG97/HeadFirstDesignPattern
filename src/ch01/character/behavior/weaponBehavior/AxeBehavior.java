package ch01.character.behavior.weaponBehavior;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("도끼를 휘두릅니다..!    서걱");
    }
}
