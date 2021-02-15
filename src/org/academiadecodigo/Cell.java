package org.academiadecodigo;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.awt.*;

public class Cell {
    private int column;
    private int row;
    private Cursor cursor;
    private Rectangle rectangle;
/*
    public Cell(int column, int row){
        this.column = cursor.getCursorColumn();
        this.row = cursor.getCursorLine();
    }
*/
    public void paint(){
      //  ((Rectangle rectangle = new Cell(cursor.getCursorColumn(),cursor.getCursorLine());
       // Cell cell = new Cell(cursor.getCursorColumn(), cursor.getCursorLine());
        rectangle.setColor(Color.ORANGE);
        rectangle.fill();
    }


}
