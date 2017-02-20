package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Larissa on 1/24/2017.
 */
public class Troll implements Monster {

        private double hitpoints = 40;


        @Override
        public void takeDamage(int amount) {
            if (hitpoints - amount / 2.0 > 0) {
                hitpoints -= amount / 2.0;
            } else {
                hitpoints = 0;
            }
        }


        @Override
        public void reportStatus() {
            System.out.println("Troll: " + hitpoints);
        }


}
