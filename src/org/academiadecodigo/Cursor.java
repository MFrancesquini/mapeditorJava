package org.academiadecodigo;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor {
    private final int PADDING;
    private final int WIDTH;
    private final int HEIGTH;
    private final Grid grid;
    private int cursorColumn = 4;
    private int cursorLine = 4;
    private Rectangle rectangle;

    public Cursor(int PADDING, int WIDTH, int HEIGTH, Grid grid){
        this.PADDING = PADDING;
        this.WIDTH = WIDTH;
        this.HEIGTH = HEIGTH;
        this.grid = grid;
    }

    public void init(){
        rectangle = new Rectangle(PADDING, PADDING, WIDTH, HEIGTH);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
    }

    public void move(int x, int y){
        rectangle.translate(x, y);

    }

    public void moveUp(){
        move(0, -10);
        cursorLine--;
    }

    public void moveDown(){
        move(0, 10);
        cursorLine++;
    }

    public void moveRight(){
        move(10, 0);
        cursorColumn++;
    }

    public void moveLeft(){
        move(-10, 0);
        cursorColumn--;
    }

    public void paint() {
        grid.getMatrix()[cursorColumn][cursorLine].paint();
        System.out.println(cursorColumn + " " + cursorLine);
    }
}
