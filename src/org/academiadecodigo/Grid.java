package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Grid {


    private int PADDING;
    private int WIDTH;
    private int HEIGTH;

    public Grid(int PADDING, int WIDTH, int HEIGTH){
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
        int innerPadding=10, columnEnd=10, lineEnd=10;
        for (int j=0; j < 50; j++) {
            for (int i = 0; i < 50; i++) {

                Rectangle square = new Rectangle(innerPadding, innerPadding, columnEnd, lineEnd);
                square.setColor(Color.BLACK);
                square.draw();

                columnEnd += 10;
            }
            lineEnd += 10;
            columnEnd = 10;
        }
    }


}
