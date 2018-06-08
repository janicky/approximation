public class Approximation {

    private static double lambda(int i) {
        return Integral.simpson(i) / Math.pow(i + 0.5, -1);
    }

}
