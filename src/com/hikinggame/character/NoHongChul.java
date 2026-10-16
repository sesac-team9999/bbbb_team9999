package com.hikinggame.character;

public class NoHongChul extends Character{
    public NoHongChul(int hp, int dodgeCount) {
        super(hp, dodgeCount);
    }

    @Override
    public void takeDamage(int damage) {
        hp = Math.max(0, hp - (damage / 2));
    }
}
