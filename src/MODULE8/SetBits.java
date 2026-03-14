package MODULE8;

public class SetBits {
    public static void main(String[] args) {
        int n = 13;
        int count = 0;

        while(n > 0){
            count += n & 1;
            n >>= 1;
        }

        System.out.println("Set bits = " + count);
    }
}
