package SnakeAndLadder.model;

public class Board {
    private final int size;
    private final int length;
    private final Cell[][] grid;

    public Board(int size){
        this.size = size;
        this.length = (int)Math.sqrt(size);
        this.grid = new Cell[length][length];
        int position = 1;
        boolean leftToRight = true;
        for (int i=length-1; i>=0; i-=1){
            if(leftToRight){
                for(int j=0; j<length; j+=1){
                    grid[i][j] = new Cell(position+=1);
                }
            }else {
                for(int j=length-1; j>=0; j-=1){
                    grid[i][j] = new Cell(position+=1);
                }
            }
            leftToRight = !leftToRight;
        }
    }

    private int getRow(int position){
        int row = (position - 1) / length;
        return length -1-row;
    }
    private int getColumn(int position){
        int column = (position - 1) % length;
        int row = getRow(position);
        return row % 2 == 0 ? length - 1 - column : column;
    }
    private Cell getCell(int position){
        return grid[getRow(position)][getColumn(position)];
    }
    public boolean addObstacle(Obstacle obstacle){
        Cell sourceCell = getCell(obstacle.getSource());
        Cell destinationCell = getCell(obstacle.getDestination());

        if(sourceCell.hasObstacle() || destinationCell.hasObstacle()){
            return false; // Cannot add obstacle if source or destination already has one
        }

        sourceCell.setObstacle(obstacle);
        return true; // Obstacle added successfully
    }
    public int getNewPosition(Player player, int offset){
        int newPosition = player.getPosition() + offset;
        if(newPosition > size){
            System.out.println("Cannot move beyond the board size. Current position: " + player.getPosition());
            return player.getPosition()
        }
    }
}
