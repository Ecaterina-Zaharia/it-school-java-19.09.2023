package homeworkLesson13;

public class Rectangle extends Shape{

  private double length;
  private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double computeArea() {
        double aria = 0;
        aria = length * width;
        return aria;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
