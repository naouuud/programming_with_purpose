import java.awt.Color;

public class RecursiveSquares {
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(Color.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 2);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.square(x, y, length / 2);
    }
    public static void draw(int n, double x, double y, double length) {
        if (n == 0) {
            StdOut.println("Enter a non-zero integer");
            return;
        }
        drawSquare(x, y, length);
        if (n == 1) return;
        drawSquare(x + length / 2, y + length / 2, length / 2);
        drawSquare(x - length / 2, y + length / 2, length / 2);
        draw(n - 1, x + length / 2, y + length / 2, length / 2);
        draw(n - 1, x - length / 2, y + length / 2, length / 2);
        drawSquare(x, y, length);
        drawSquare(x + length / 2, y - length / 2, length / 2);
        drawSquare(x - length / 2, y - length / 2, length / 2);
        draw(n - 1, x + length / 2, y - length / 2, length / 2);
        draw(n - 1, x - length / 2, y - length / 2, length / 2);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}
