package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.graphics.Color;


public class CursorKeyboardHandler implements KeyboardHandler {
    private Cursor cursor;
    private Cell cell;
    private Grid grid;

    public CursorKeyboardHandler(Cursor cursor){
        this.cursor = cursor;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_SPACE:
                Rectangle rectangle = new Rectangle(cursor.getCursorLine(), cursor.getCursorColumn(), 10,10);
                rectangle.setColor(Color.BLACK);
                rectangle.fill();
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
