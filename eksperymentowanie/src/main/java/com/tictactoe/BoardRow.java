package com.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> cols = new ArrayList<>();

    public BoardRow() {
        for(int n=0; n<3; n++)
            cols.add(Figure.NONE);
    }

    public List<Figure> getCols() {
        return cols;
    }
}
