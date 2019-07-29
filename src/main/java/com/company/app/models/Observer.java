package com.company.app.models;

import com.company.app.Cell;

import java.util.List;

public interface Observer {
    void update(List<Piece> deletedItems);
}
