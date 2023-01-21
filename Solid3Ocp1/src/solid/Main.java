package solid;

import solid.ocp.Calculate;
import solid.ocp.RightTriangle;
import solid.ocp.Shape;
import solid.ocp.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += ((Calculate) shape).getArea();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
