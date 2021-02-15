package org.academiadecodigo;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;


public class Cell {
    private int column;
    private int row;
    private Rectangle rectangle;

    public Cell(int column, int row, int cellSize){
        this.column = column;
        this.row = row;
        rectangle = new Rectangle(cellSize * column + cellSize, cellSize * row + cellSize, cellSize, cellSize);
        rectangle.draw();
    }

    public void paint(){
        rectangle.setColor(Color.ORANGE);
        rectangle.fill();
    }


}
