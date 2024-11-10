package b2103500;

public class MyCalc {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static double min(double a, double b) {
        return a > b ? b : a;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double mul(double a, int b) {
        double mux = 1;
        for (int n = 0; n < b; n++) {
            mux = mux * a;
        }
        return mux;
    }

    public static boolean equal(int a, int b) {
        return a == b;
    }

    public static double qrt(double a) {
        return a * a;
    }

    public static int progression(int x, int d, int n) {
        // Tính số hạng thứ n của cấp số công
        return x + (n - 1) * d;
    }

    public static int sumProgression(int x, int d, int n) {
        // Tính tổng n số hạng đầu tiên của cấp số công
        return n * (2 * x + (n - 1) * d) / 2;
    }
    
    public static void main(String[] args){
        //MyCalcTest.testAdd();
        int x = progression(2, 3, 2);
        int y = sumProgression(2, 3, 2);
        System.out.println(x +" "+y);
    }
}
