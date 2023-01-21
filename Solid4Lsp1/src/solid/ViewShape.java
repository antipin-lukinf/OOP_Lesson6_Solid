package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;

public class ViewShape {
    private Shape rectangle;

    public ViewShape(Shape rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
