package SnakeAndLadder.factory;

import SnakeAndLadder.enums.ObstacleType;
import SnakeAndLadder.model.Ladder;
import SnakeAndLadder.model.Obstacle;
import SnakeAndLadder.model.Snake;

public class ObstacleFactory {
    public static Obstacle createObstacle(ObstacleType obstacleType, int startPosition, int endPosition){
        return switch(obstacleType){
            case SNAKE -> new Snake(startPosition, endPosition);
            case LADDER -> new Ladder(startPosition, endPosition);
            default -> throw new IllegalArgumentException("Unknown obstacle type:"+ obstacleType);
        };
    }
}
