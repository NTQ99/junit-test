package app;

public class App {

    public static int triangleType(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) return 0;
            if (a == b || b == c || c == a) return 1;
            return 2;
        }
        else {
            if (a <= 0 || b <= 0 || c <= 0) return 4;
            return 3;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(triangleType(1, 2, 3));
    }
}
