package bpj.lesson15;

public class Tester {

    public static void main(String[] args) {
        Circle c = new Circle(35.5);

        System.out.println("Diameter: " + c.diameter());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
