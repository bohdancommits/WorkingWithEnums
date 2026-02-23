package org.example;

import java.util.Random;

public class Mover
{
    private int x;
    private int y;
    private int totalCost;
    public Mover()
    {
        x = 0;
        y = 0;
        totalCost = 0;
    }
    public void move(Direction direction){
        // moving north  y increase
        if(direction == Direction.NORTH){
            y = y + 1;
        } // decrease y
        else if(direction == Direction.SOUTH){
            y = y - 1;
        }
        // increase  x
        else if(direction == Direction.EAST){
            x = x + 1;
        }
        else if(direction == Direction.WEST){
            x = x - 1;
        }
        // total cost of that direction
        totalCost = totalCost + direction.getCost();
        System.out.println("Moved " + direction +
                " | Cost: " + direction.getCost());
        System.out.println("-------------------");
    }
    public void move10Times(){
        Random random = new Random();
        Direction[] directions = Direction.values();

        for(int i=0; i<10; i++){
            Direction randomDirection = directions[random.nextInt(directions.length)];
            move(randomDirection);

        }
        System.out.println("Final Position: (" + x + ", " + y + ")");
        System.out.println("Total Cost: " + totalCost);
    }
    public boolean isExpensiveMove(Direction direction){
        return direction.getCost() >= 6;
    }
}
