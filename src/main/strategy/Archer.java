package main.strategy;

public class Archer extends Unit{
    public Archer() {
        setWeaponBehavior(new BowBehavior());
    }
}
