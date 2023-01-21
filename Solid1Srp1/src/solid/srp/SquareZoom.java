package solid.srp;

public class SquareZoom {
    public Square mySquare;

    public SquareZoom(Square mySquare) {
        this.mySquare = mySquare;
    }

    public void draw() {
        for (int i = 0; i < mySquare.getSide(); i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < mySquare.getSide(); i++) {
            System.out.print("*");
            for (int j = 1; j < mySquare.getSide() - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < mySquare.getSide(); i++) {
            System.out.print("*");
        }
    }

}
