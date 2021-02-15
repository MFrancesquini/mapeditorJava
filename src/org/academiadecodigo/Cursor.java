package org.academiadecodigo;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.awt.*;
import java.security.PublicKey;

public class Cursor {
    private int PADDING;
    private int WIDTH;
    private int HEIGTH;

    public Cursor(int PADDING, int WIDTH, int HEIGTH){
        this.PADDING = PADDING;
        this.WIDTH = WIDTH;
        this.HEIGTH = HEIGTH;
    }

    public void init(){
        Rectangle rectangle = new Rectangle(PADDING, PADDING, WIDTH, HEIGTH);
        rectangle.setColor(Color.GREEN);
        rectangle.fill();
    }
}
