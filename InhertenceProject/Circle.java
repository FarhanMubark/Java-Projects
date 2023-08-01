package InhertenceProject;// chaild of shape

public class Circle extends Shape {
    private double radius =1.0;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return radius * radius*Math.PI;
    }
// r*2 -> * pi
    public double getPerimetrs(){
        Double res;
        res = radius*2;
        return res*Math.PI ;
    }


    @Override
    public String toString() {
        return "A Circle with Redius" + getRadius() +
                " is subclass of Shape where Shape is the output of the toString() method from the superclass. ";
    }
}
