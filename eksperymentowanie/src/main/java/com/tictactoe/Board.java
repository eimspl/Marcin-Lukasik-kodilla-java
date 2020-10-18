package com.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();
    public void setFigure(int col, int row, Figure figure) {
        rows.get(row).getCols().set(col, figure);

    }

    public Figure getFigure(int col, int row)
    {
        return rows.get(row).getCols().get(col);
    }

    public Board() {
        for(int n=0;n<3;n++)
            rows.add(new BoardRow());
    }


}
