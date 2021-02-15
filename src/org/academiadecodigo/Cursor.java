package org.academiadecodigo;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor {
    private final int PADDING;
    private final int WIDTH;
    private final int HEIGTH;
    private int cursorColumn = 50;
    private int cursorLine = 50;
    private Rectangle rectangle;

    public Cursor(int PADDING, int WIDTH, int HEIGTH){
        this.PADDING = PADDING;
        this.WIDTH = WIDTH;
        this.HEIGTH = HEIGTH;
    }

    public void init(){
        rectangle = new Rectangle(PADDING, PADDING, WIDTH, HEIGTH);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
    }

    public int getCursorColumn() {
        return cursorColumn;
    }

    public int getCursorLine() {
        return cursorLine;
    }

    public void setCursorColumn(int cursorColumn) {
        this.cursorColumn = cursorColumn;
    }

    public void setCursorLine(int cursorLine) {
        this.cursorLine = cursorLine;
    }

    public void move(int x, int y){
        rectangle.translate(x, y);

    }

    public void moveUp(){
        move(0, -10);
        setCursorColumn(cursorLine - 10);
    }

    public void moveDown(){
        move(0, 10);
        setCursorColumn(cursorLine + 10);
    }

    public void moveRight(){
        move(10, 0);
        setCursorLine(cursorColumn + 10);
    }

    public void moveLeft(){
        move(-10, 0);
        setCursorLine(cursorColumn - 10);
    }
}
