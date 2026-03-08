package MODULE4;

public class P10_Demo_static {
    static {
        System.out.println("Static block is executed");
    }

    P10_Demo_static() {
        System.out.println("Constructor is executed");
    }

    public static void main(String[] args) {
        P10_Demo_static obj1 = new P10_Demo_static();
        P10_Demo_static obj2 = new P10_Demo_static();
    }
}
