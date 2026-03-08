package MODULE4;

public interface P2_vehicle {
    void start();
}
class Car implements P2_vehicle{
    public void start(){
        System.out.println("car is starting!");
    }

    static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
