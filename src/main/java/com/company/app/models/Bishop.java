package com.company.app.models;

import com.company.app.Cell;

import java.util.List;

public class Bishop extends Piece {
    public Bishop() {
        moveBehaviour = new BishopMove();
    }

    public List<Cell> getValidMoves() {

    }
}
