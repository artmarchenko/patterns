package main.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void ranker_fight(){
        Unit ranker = new Ranker();
        ranker.fight();
    }

    @Test
    void berserk_fight(){
        Unit berserk = new Berserk();
        berserk.fight();
    }

    @Test
    void archer_fight(){
        Unit archer = new Archer();
        archer.fight();
    }

    @Test
    void archer_fight_with_sword(){
        Unit archer = new Archer();
        archer.fight();
        archer.setWeaponBehavior(new SwordBehavior());
        archer.fight();
    }



}