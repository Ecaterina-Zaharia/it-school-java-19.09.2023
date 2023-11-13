package homeworkLesson13;

// 6. Write a method called displayFirstTwo that takes a list of any type and displays the first two elements.
// Use a wildcard in the method parameter.

import java.util.List;

public class FirstTwo {

    public static void displayFirstTwo(List<?> list){
        if(list.size() >= 2){
            System.out.println(list.get(0));
            System.out.println(list.get(1));
        }
    }
}
