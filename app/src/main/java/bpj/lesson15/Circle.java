package bpj.lesson15;

public class Circle {
    //state variable
    private double radius;

    public Circle(double r){
        radius = r;
    }

    // @Override
    public boolean equals(Circle anotherCircle){
        if(this.radius == anotherCircle.radius) return true;
        else return false;
    }

    public String toString(){
        return "[Circle: radius = "+this.radius+" ]";
    }

    public double diameter(){
        return 2 * radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }
}
