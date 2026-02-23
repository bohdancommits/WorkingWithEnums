package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        // mover object
        Mover mover = new Mover();

        // move randomly one time
        Direction[] allDirections = Direction.values();
        int size = allDirections.length;
        Direction randomDirection = allDirections[random.nextInt(size)];
        mover.move(randomDirection);

        // move randomly 10 times
        mover.move10Times();

    }
}