package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Larissa on 1/24/2017.
 */
public class Troll implements Monster {

    // Could pull out hitpoints and name into a constructor but it appears to be uniform based on specifications?
        private double hitpoints = 40;

    // Trolls take half damage
        @Override
        public void takeDamage(int amount) {
            if (hitpoints - amount / 2.0 > 0) {
                hitpoints -= amount / 2.0;
            } else {
                hitpoints = 0;
            }
        }

    // Print out current hitpoints for this troll
        @Override
        public void reportStatus() {
            System.out.println("Troll: " + hitpoints);
        }


}
