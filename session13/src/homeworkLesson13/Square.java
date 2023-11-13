package homeworkLesson13;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double computeArea() {
        double aria = 0;
        aria = side * side;
        return aria;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
