package homeworkLesson13;

public class NonFlyableBird extends Bird {

    public String walk(){

        return "walk";
    }

    @Override
    public String peck() {
        return super.peck();
    }
}
