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

    private static double integralError(double x) {
        return Math.abs(Configuration.function(x) - approx(x));
    }

    public static double errorEstimation() {
        double dx = (Configuration.b - Configuration.a) / Configuration.m;
        double sum = 0d;
        double st = 0d;

        for (int i = 1; i <= Configuration.m; i++) {
            double x = Configuration.a + i * dx;
            st += integralError(x - dx / 2);
            if (i < Configuration.m) {
                sum += integralError(x);
            }
        }
        return dx / 6 * (integralError(Configuration.a) + integralError(Configuration.b) + 2 * sum + 4 * st);
    }

}
