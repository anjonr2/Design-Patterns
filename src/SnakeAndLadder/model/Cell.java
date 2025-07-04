package SnakeAndLadder.model;

public class Cell {
    private final int position;
    private Obstacle obstacle;

    public int getPosition() {
        return position;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Cell(int position){
        this.position = position;
    }

    public boolean hasObstacle(){
        return obstacle != null;
    }

    //this checks if the cell has an obstacle or not
    //if the cell has obstacle, then it will return the destination position of the player for that obstacle
    public int getFinalPosition(){
        return hasObstacle() ? obstacle.move() : position;
    }
}
