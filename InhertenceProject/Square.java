package InhertenceProject;

//child of rectangle
public class Square extends Rectangle{


    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Square(){
    }

   public void setSide(Double side){
        super.setWidth(side);
        super.setLength(side);
   }

   public Double getSide(){
        return super.getWidth()*getLength();
   }

    @Override
    public Double getArea() {
        return Math.pow(getSide(),2);
    }

    @Override
    public Double getPeremetirs() {
        return getSide()*4;
    }

    @Override
    public String toString() {
        return  "A Square with side "+getSide()+" which is a subclass of Rectangle where Side is the output of the toString() method from the superclass.";
    }
}
