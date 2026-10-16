package com.hikinggame.character;

public abstract class Character {
    protected int hp;
    protected int maxHp;
    protected int dodgeCount;
    protected int progress;

    public Character(int hp, int dodgeCount) {
        this.hp = hp;
        this.dodgeCount = dodgeCount;
    }

    public abstract void takeDamage(int damage);
}
