package main.strategy;

public class Ranker extends Unit{
    public Ranker() {
        setWeaponBehavior(new SwordBehavior());
    }
}
