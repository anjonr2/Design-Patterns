package SnakeAndLadder.model;

import java.util.Random;

public class Dice {
    private final int noOfDice;
    private final Random random = new Random();

    public Dice(int noOfDice){
        this.noOfDice = noOfDice;
    }

    public int roll(){
        int sum = 0;
        for(int i=0; i<noOfDice; i+=1){
            sum += random.nextInt(6) + 1; // Generates a number between 1 and 6
        }
        return sum;
    }
}
