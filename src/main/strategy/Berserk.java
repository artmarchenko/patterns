package main.strategy;

public class Berserk extends Unit{
    public Berserk() {
        setWeaponBehavior(new AxeBehavior());
    }
}
