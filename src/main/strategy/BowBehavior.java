package main.strategy;

public class BowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Arrow strike!");
    }
}
