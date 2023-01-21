package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareZoom;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareZoom mySquareZoom = new SquareZoom(square);
        mySquareZoom.draw();
    }
}
