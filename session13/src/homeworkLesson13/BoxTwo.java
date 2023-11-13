package homeworkLesson13;

// 7. Create a generic class called Box that stores an item of any type.
// Implement methods to put an item into the box and retrieve it.

public class BoxTwo <T> {

    private T itemTwo;


    public void put(T item){
        this.itemTwo = item;
    }

    public T getItemTwo() {
        return itemTwo;
    }
}
