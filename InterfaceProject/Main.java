package InterfaceProject;

public class Main {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(5,7,4,6);
        m1.setxSpeed(10);
        m1.setX(6);
        m1.setxSpeed(8);
        m1.moveDown();
        m1.moveLeft();
        m1.moveRight();
        m1.moveUp();
    }
}
