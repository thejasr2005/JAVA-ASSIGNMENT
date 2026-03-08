package MODULE4;

abstract class Shape{
    abstract void display();
}
class Circle extends Shape {
    void display(){
        System.out.println("the shape is circle");
    }

    static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}

