package MODULE5;

public class P1_arithmetic {
    static void main(String[] args) {
        int i = 1, j = 0, k;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println("we cannot divide any number by zero");
        }
    }
}
