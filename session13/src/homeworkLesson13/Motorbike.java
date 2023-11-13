package homeworkLesson13;

public class Motorbike implements Vehicle, Car{

    @Override
    public void refueling() {
        System.out.println("refueling");
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
}
