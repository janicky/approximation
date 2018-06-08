public class Configuration {
    public static double a = -1;
    public static double b = 1;
    public static int m = 10; // liczba przedziałów całkowania

    public static double function(double x) {
        return Math.PI - 0.4 * x * x * x;
    }
}
