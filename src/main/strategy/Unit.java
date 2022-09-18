package main.strategy;

public abstract class Unit {
    private WeaponBehavior weaponBehavior;

    void fight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
