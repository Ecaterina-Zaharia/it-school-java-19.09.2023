package homeworkLesson13;

// 5. Write a generic method called printItems that takes a list of any type and prints each item.
// Use an upper bound to ensure that the list elements implement the CharSequence interface.

import java.util.List;

public class ListChar {

    public static <T extends CharSequence> void printItems(List<T> list){
        for(T item: list){
            System.out.println(item);
        }
    }
}
