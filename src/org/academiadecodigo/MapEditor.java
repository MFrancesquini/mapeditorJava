package org.academiadecodigo;

public class MapEditor {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 470, 470);
        grid.init();
        grid.innerSquares();
        Cursor cursor = new Cursor(50, 10, 10);
        cursor.init();
    }
}
