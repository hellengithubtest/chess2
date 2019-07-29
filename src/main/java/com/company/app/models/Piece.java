package com.company.app.models;

import com.company.app.Board;
import com.company.app.Cell;
import com.company.app.PlayerColor;

import java.util.List;

public abstract class Piece {
    private Cell currentCell;
    protected MoveBehaviour moveBehaviour;
    private final PlayerColor color ;

    public Piece() {
    }

    public Cell getCurrentCell() {
        return this.currentCell;
    }
    public void setCurrentCell(Cell nextCell) {
        this.currentCell = nextCell;
    }
    public PlayerColor getColor() {
        return this.color;
    }

    public abstract List<Cell> getValidMoves();

    public String toString() {
        return "Current cell: " + currentCell + " Color: " + color;
    }
}
