package com.company.app.models;

import com.company.app.Board;
import com.company.app.Cell;
import com.company.app.PlayerColor;

import java.util.ArrayList;
import java.util.List;

public final class BishopMove implements MoveBehaviour {


    @Override
    public List<Cell> getValidMove(Board board, Cell currentCell) {
        List<Cell> available = new ArrayList<Cell>();
        List<Cell> valid = new ArrayList<Cell>();

        /*
        get neighbour
         */
        available.add(new Cell(currentCell.getX() + 1, currentCell.getY() + 1));
        available.add(new Cell(currentCell.getX() - 1, currentCell.getY() + 1));
        available.add(new Cell(currentCell.getX() - 1, currentCell.getY() - 1));
        available.add(new Cell(currentCell.getX() + 1, currentCell.getY() - 1));

        for (Cell cell : available) {
            int nextX = cell.getX();
            int nextY = cell.getY();

            while (!board.isNotWithinTheBorders(nextX, nextY) && board.getBoardPieces()[nextX][nextY] == null) { //exp false
                valid.add(new Cell(nextX, nextY));
                int diffX = currentCell.getX() - nextX;
                int diffY = currentCell.getY() - nextY;
                nextX = nextX - diffX;
                nextY = nextY - diffY;
            }
            if (board.isNotWithinTheBorders(nextX, nextY)) {
                continue;
            } else if (board.getBoardPieces()[nextX][nextY].getColor() == getColor()) {
                continue;
            } else {
                valid.add(new Cell(nextX, nextY));
            }
        }
        return valid;
    }

    public String toString() {
        if(this.getColor() == PlayerColor.WHITE){
            return "♗";
        } else {
            return "♝";
        }
        //return "B " + this.getColor();
    }
}
