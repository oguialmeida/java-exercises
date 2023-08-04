package medium.capital;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double finalPrice(double value, double quant) {
        return  (value * quant) - ((value * quant) * IOF);
    }
}
