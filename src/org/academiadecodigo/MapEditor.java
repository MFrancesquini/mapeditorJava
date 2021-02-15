package org.academiadecodigo;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

public class MapEditor {

    public static void main(String[] args) {

        // Cursor
        Cursor cursor2 = new Cursor(50, 10, 10);
        // cursor.init();
        CursorKeyboardHandler cursorKeyboardHandler = new CursorKeyboardHandler(cursor2);

        Keyboard keyboard;
        keyboard = new Keyboard(cursorKeyboardHandler);


        Grid grid = new Grid(10, 470, 470);

        grid.init();
        grid.innerSquares();
        cursor2.init();

        keyboard.addEventListener(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);
    }
}
