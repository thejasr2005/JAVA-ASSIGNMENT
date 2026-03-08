package MODULE5;

    public class P4_customexception extends RuntimeException {
        P4_customexception(String msg) {     //constructor
            super(msg);
        }
        static void num(int i) {
            int[] arr = {1, 2, 3, 4,};
            if (i > 3) {
                throw new P4_customexception("the index u given is greater");
            }
            System.out.println("the index is" + arr[i]);
        }
        static void main(String[] args) {
            num(5);
        }
    }