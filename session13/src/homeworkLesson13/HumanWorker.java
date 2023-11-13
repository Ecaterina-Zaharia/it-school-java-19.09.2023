package homeworkLesson13;

public class HumanWorker implements Worker, JustEating{

    @Override
    public void eating() {
        System.out.println("Eating");
    }

    @Override
    public void working() {
        System.out.println("Working");
    }
}
