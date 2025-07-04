package SnakeAndLadder.model;

import SnakeAndLadder.enums.ObstacleType;

/**
 * Abstract class representing an obstacle in the game of Snake and Ladder.
 * It can be either a Snake or a Ladder.
 */
public abstract class Obstacle {
    protected int source;
    protected int destination;

    public Obstacle(int source, int destination){
        this.source = source;
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    //whenever any player comes on the source of the obstacle, it will move to the destination cell number
    public int move(){
        return destination;
    }

    public abstract ObstacleType getObstacleType();
}
