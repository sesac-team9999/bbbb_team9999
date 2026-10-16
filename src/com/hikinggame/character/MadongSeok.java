package com.hikinggame.character;

public class MadongSeok extends Character{

    public MadongSeok(int hp, int dodgeCount) {
        super(hp,dodgeCount);
    }

    @Override
    public void takeDamage(int damage) {
        hp = Math.max(0, hp - damage);
    }
}
