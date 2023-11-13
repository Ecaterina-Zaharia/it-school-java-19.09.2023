package homeworkLesson13;

// 1. Define a generic class called Box that can hold an object of any type.
// Implement methods to set and get the value inside the box.

public class Box <T> {
   private T boxItem;

    public T getBoxItem() {
        return boxItem;
    }

    public void setBoxItem(T boxItem) {
        this.boxItem = boxItem;
    }
}
