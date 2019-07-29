package com.company.app.models;

import com.company.app.Board;
import com.company.app.Cell;

import java.util.List;

public interface MoveBehaviour {
    List<Cell> getValidMove(Board board, Cell currentCell);
}
