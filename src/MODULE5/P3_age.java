package MODULE5;

public class P3_age {
    static void checkage(int age){
        if (age>18){
            System.out.println("access granted");
        }else{
            throw new RuntimeException("access prohibited");
        }
        System.out.println("please enjoy the website");
    }

    static void main(String[] args) {
        //checkage(15);
        checkage(24);
    }
}
