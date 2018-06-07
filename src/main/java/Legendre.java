public class Legendre {

    public static double polynomial(int n, double x) {
        if (n <= 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            return ((2*n - 1) / n) * x * polynomial(n - 1, x) - ((n - 1) / n) * polynomial(n - 2, x);
        }
    }
}
