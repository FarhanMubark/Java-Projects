package InterfaceProject;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int ySpeed;
    private int xSpeed;

    public MovablePoint(int x, int y, int ySpeed, int xSpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        int res = y+ySpeed;
        System.out.println("Move Up: "+ res);

    }

    @Override
    public void moveDown() {
        int res =y-ySpeed;
        System.out.println("Move Down: " + res);
    }

    @Override
    public void moveRight() {
        int res = x+xSpeed;
        System.out.println("Move Right: "+res);
    }

    @Override
    public void moveLeft() {
        int res = x-xSpeed;
        System.out.println("Move Left: "+res);
    }
}
