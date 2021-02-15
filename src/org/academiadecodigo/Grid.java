package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Grid {


    private int PADDING;
    private int WIDTH;
    private int HEIGTH;

    private Cell[][] matrix;

    private Cursor cursor;
    public Grid(int PADDING, int WIDTH, int HEIGTH){
        matrix = new Cell[WIDTH][HEIGTH];
        this.PADDING = PADDING;
        this.WIDTH = WIDTH;
        this.HEIGTH = HEIGTH;
    }

    public void init(){
        Rectangle rectangle = new Rectangle(PADDING, PADDING, WIDTH, HEIGTH);
        rectangle.setColor(Color.WHITE);
        rectangle.fill();
    }
    public void innerSquares(){

        int innerPadding=10;
        for (int j=0; j < 50; j++) {

            for (int i = 0; i < 50; i++) {

                matrix[j][i] = new Cell(j, i, innerPadding);


            }
        }
    }


    public Cell[][] getMatrix() {
        return matrix;
    }
}
