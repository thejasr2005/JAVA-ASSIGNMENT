package MODULE5;

public class P2_finally {
    static void main(String[] args) {
        int i = 1, j = 0, k;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            System.out.println("we cannot divide any number by zero");
        }
        finally{
            System.out.println("the block will get executed");
        }
    }
}
