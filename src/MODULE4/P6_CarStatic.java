package MODULE4;

public class P6_CarStatic {
    static int num;
    static void read(){
        System.out.println("the car is BMW and HP is " + num);
    }
    static void main(String[] args) {
        num=720;
        read();
    }
}

