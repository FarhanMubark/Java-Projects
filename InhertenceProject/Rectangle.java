package InhertenceProject;

//chaild of shape
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){}

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Double getArea(){
        return width * length;
    }

    public Double getPeremetirs(){
        return (width*length)*2;
    }


    @Override
    public String toString() {
        return "A Rectangle with width" + getWidth() + " and length " + getLength()  +
                " is subclass of Shape where is the output of the toString() method from the superclass. ";
    }
}
