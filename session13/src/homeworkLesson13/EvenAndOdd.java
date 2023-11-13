package homeworkLesson13;

// 3. Write a Java program to create a generic method that takes a list of numbers
// and returns the sum of all the even and odd numbers.

import java.util.List;

public class EvenAndOdd {

    public static <T extends Number> void numberSum(List<T> numbers){
        double evenSum = 0;
        double oddSum = 0;

        for(T number: numbers){
            if (number.doubleValue() %2 == 0){
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}
