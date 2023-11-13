package homeworkLesson13;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double computeArea() {
        double pi = 3.1415;
        double aria = 0;
        aria = pi * (radius*radius);
        return aria;
    }






}
