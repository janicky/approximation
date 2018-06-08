public class Approximation {

    private static double lambda(int i) {
        return Integral.simpson(i) / Math.pow(i + 0.5, -1);
    }

    public static double approx(double x) {
        double result = 0d;
        for (int i = 0; i <= Configuration.n; i++) {
            result += lambda(i) * Legendre.polynomial(i, x);
        }
        return result;
    }

}
