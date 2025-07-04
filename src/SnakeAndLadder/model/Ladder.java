package SnakeAndLadder.model;

import SnakeAndLadder.enums.ObstacleType;

public class Ladder extends Obstacle{
    public Ladder(int top, int bottom){
        //incase of ladder, source is the bottom and destination is the top since player climbs up
        super(bottom, top);
    }
    @Override
    public ObstacleType getObstacleType() {
        return ObstacleType.LADDER;
    }
}
