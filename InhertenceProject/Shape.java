package InhertenceProject;

//Parent
public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;


    }
    public boolean isFilled() {
        if (true){
            System.out.println("is Filled");
        } else System.out.println("not Filled");
        return filled;
    }


    public String toString() {
        return "Shape{" +
                "With='" + color + '\'' +
                ", length='" + filled + '\'' +
                '}';
    }
}
