public class Integral {

    public static double simpson(int l) {
        double dx = (Configuration.b - Configuration.a) / Configuration.m;
        double sum = 0d;
        double st = 0d;

        for (int i = 1; i <= Configuration.m; i++) {
            double x = Configuration.a + i * dx;
            st += Configuration.function(x - dx / 2) * Legendre.polynomial(l, x - dx / 2);
            if (i < Configuration.m) {
                sum += Configuration.function(x) * Legendre.polynomial(l, x);
            }
        }

        return (dx / 6) * ((Configuration.function(Configuration.a) * Legendre.polynomial(l, Configuration.a)) +
                (Configuration.function(Configuration.b) * Legendre.polynomial(l, Configuration.b)) + 2 * sum + 4 * st);
    }

}
