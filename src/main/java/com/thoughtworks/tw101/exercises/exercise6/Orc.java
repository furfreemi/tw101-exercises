package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Larissa on 1/24/2017.
 */
public class Orc implements Monster {

    private int hitpoints = 20;

    @Override
    public void takeDamage(int amount) {
        if (hitpoints - amount > 0) {
            hitpoints -= amount;
        } else {
            hitpoints = 0;
        }
    }

    // Hardcoded name as all Orcs appear to be named Orc?
    @Override
    public void reportStatus() {
        System.out.println("Orc: " + hitpoints);
    }
}
