package SnakeAndLadder.model;

import SnakeAndLadder.enums.ObstacleType;

public class Snake extends Obstacle{
    public Snake(int head, int tail){
        //for snake source is the head and destination is the tail
        super(head, tail);
    }
    public ObstacleType getObstacleType(){
        return ObstacleType.SNAKE;
    }
}
