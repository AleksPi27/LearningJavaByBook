package com.example;

public class Unit {

    private int health;
    private final int damage;



    public Unit(int health, int damage) {
        this.health = health;
        this.damage=damage;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int incomingDamage) {
        health -= incomingDamage;
    }

    public void dealDamage(Unit damageTaker) {
        damageTaker.takeDamage(damage);
    }


}
