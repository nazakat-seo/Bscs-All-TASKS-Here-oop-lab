package Overloading_Shape;

class Shape{
    void draw(){
        System.out.print("Draw any Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.print("Draw a Good Cicle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape dc =new Circle();
        dc.draw();

    }
}