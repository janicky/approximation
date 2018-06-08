public class Configuration {

    public static double a = -1; // przedział
    public static double b = 1; // przedział

    public static int m = 100; // liczba przedziałów całkowania
    public static int n = 3; // stopień wielomianu

    public static double function(double x) {
        return Math.PI - 0.4 * x * x * x;
    }
}
