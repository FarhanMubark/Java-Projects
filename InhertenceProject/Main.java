package InhertenceProject;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape("green",true);
        System.out.println(s1.isFilled());
        System.out.println(s1.toString());

        Rectangle r1 = new Rectangle("red",true, 12,1);
        System.out.println("The Rectangle with length " + r1.getLength() + " and width " + r1.getWidth() + " has area " + r1.getArea() + " and peremetir " + r1.getPeremetirs() );
        System.out.println(r1.toString());

        Rectangle r2 = new Rectangle("Green",false, 10,2);
        System.out.println("The Rectangle with length " + r2.getLength() + " and width " + r2.getWidth() + " has area " + r2.getArea() + " and peremetir " + r1.getPeremetirs() );
        System.out.println(r2.toString());

        Circle c1 = new Circle("Yellow",true,2);
        System.out.println("The Cricle has "+c1.getColor()+" color with radius " + c1.getRadius()+ "  has Area " +c1.getArea() +" and has peremetirs" + c1.getPerimetrs());
        System.out.println(c1.toString());

        Square q1 = new Square("Pink",false,3,6);
        System.out.println("The Square has "+ q1.getColor() + " color and Side of " + q1.getSide()+ " Has Area " + q1.getArea() +" has pereimters "+ q1.getPeremetirs());
        System.out.println(q1.toString());




    }
}