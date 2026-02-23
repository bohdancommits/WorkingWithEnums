package org.example;

public enum Direction {
    NORTH(5),
    SOUTH(6),
    EAST(4),
    WEST(7);
    private int cost;
    //constructor
    Direction(int cost) {
        this.cost = cost;
    }
    // getter
    public int getCost() {
        return cost;
    }
}
