package medium.retangulo;

public class Retangulo {
    public double width;
    public double height;

    public double totalArea() {
        return width * height;
    }

    public double totalPerimetro() {
        return 2 * (width + height);
    }

    public double totalDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
