package homeworkLesson13;

// 4. Write a Java program to create a generic method that takes a list of any type
// and returns it as a new list with the elements in reverse order.

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {

    public static <T> List <T> reverseList (List<T> originalList){
        List <T> reversedList = new ArrayList<>();
        for (int i = originalList.size() - 1; i >= 0; i--){
            reversedList.add(originalList.get(i));
        }
        return reversedList;
    }
}
