package medium.triang;

class Triangle {
    public double[] a = new double[2];
    public double[] b = new double[2];
    public double[] result = new double[2];

    public double TriangArea(double num1, double num2) {
        return (num1 * num2) / 2;
    }

    public int CompareTriang(double num1, double num2) {
        return (num1 > num2) ? 1 : 2;
    }
}
