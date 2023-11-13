package homeworkLesson13;

import java.util.List;

import static homeworkLesson13.CopmareArrays.compareArrayMethod;
import static homeworkLesson13.EvenAndOdd.numberSum;
import static homeworkLesson13.FirstTwo.displayFirstTwo;
import static homeworkLesson13.ListChar.printItems;
import static homeworkLesson13.ReverseOrder.reverseList;

public class MainClass {

    public static void main(String[] args) {

        // Part I - Generics

        // 1. Define a generic class called Box that can hold an object of any type.
        // Implement methods to set and get the value inside the box.

        Box <Integer> box = new Box<>();
        box.setBoxItem(500);

        System.out.println(box.getBoxItem());

        Box<String> boxString = new Box<>();
        boxString.setBoxItem("Cookies");

        System.out.println(boxString.getBoxItem());

        System.out.println("-------------------");

        // 2. Write a Java program to create a generic method that takes two arrays of the same type
        // and checks if they have the same elements in the same order (pass different types).

        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {1, 2, 2, 4};
        Integer[] array3 = {1, 2, 3, 4};

        String[] array4 = {"One", "Two", "Three"};
        String[] array5 = {"One", "Two", "Two"};
        String[] array6 = {"One", "Two", "Three"};

        System.out.println("Compare array1 and array2: " + compareArrayMethod(array1, array2));
        System.out.println("Compare array1 and array3: " + compareArrayMethod(array1, array3));
        System.out.println("Compare array4 and array5: " + compareArrayMethod(array4, array5));
        System.out.println("Compare array4 and array6: " + compareArrayMethod(array4, array6));

        System.out.println("---------");

        // 3. Write a Java program to create a generic method that takes a list of numbers
        // and returns the sum of all the even and odd numbers.

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        numberSum(integers);

        List<Double> doubles = List.of(1.0, 2.0, 3.5, 4.7, 5.0, 6.9, 7.0);
        numberSum(doubles);

        System.out.println("-------------");

        // 4. Write a Java program to create a generic method that takes a list of any type
        // and returns it as a new list with the elements in reverse order.

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> numbersInWords = List.of("One", "Two", "Three", "Four");

        List<Integer> reversedNumbers = reverseList(numbers);

        System.out.println("Original list of numbers: " + numbers);
        System.out.println("List of reversed numbers: " + reversedNumbers);

        List<String> reversedWords = reverseList(numbersInWords);

        System.out.println("Original list of numbers: " + numbersInWords);
        System.out.println("List of reversed numbers: " + reversedWords);

        System.out.println("---------------");

        // 5. Write a generic method called printItems that takes a list of any type and prints each item.
        // Use an upper bound to ensure that the list elements implement the CharSequence interface.

        List<String> listEx5 = List.of("Ann", "Peter", "John", "Greg");
        printItems(listEx5);

        System.out.println("-----------");
        // 6. Write a method called displayFirstTwo that takes a list of any type and displays the first two elements.
        // Use a wildcard in the method parameter.

        List<Integer> listIntFirstTwo = List.of(1, 2, 3, 4, 5);
        displayFirstTwo(listIntFirstTwo);

        List<String> listStrFirstTwo = List.of("One", "X", "Y", "Z");
        displayFirstTwo(listStrFirstTwo);

        System.out.println("-------------");

       // 7. Create a generic class called Box that stores an item of any type.
        // Implement methods to put an item into the box and retrieve it.

        BoxTwo<String> boxTwo = new BoxTwo<>();
        boxTwo.put("Candy");

        System.out.println(boxTwo.getItemTwo());

        BoxTwo<Integer> boxTwoInt = new BoxTwo<>();
        boxTwoInt.put(100);

        System.out.println(boxTwoInt.getItemTwo());

        System.out.println("--------------");

        // Part II ENUM

        // 1. Create an enum called Weekday representing the days of the week (Monday, Tuesday, ..., Sunday).

        for (Weekday weekday: Weekday.values()) {
            System.out.println(weekday.name());
        }

        System.out.println("-------------------");

        // 2. Improve the Weekday enum and add a method called isWeekend into it.

        for (Weekday day: Weekday.values()){
            if(day.isWeekend()){
                System.out.println(day + " is a weekend day");
            }else {
                System.out.println(day + " is a weekday");
            }
        }

        System.out.println("--------------------");

        // 3. Define an enum called Planet representing planets in our solar system. Each planet should have fields for mass and radius.
        // Include a constructor to initialize these values.

        for(Planet planets : Planet.values()){
            System.out.println(planets.name() + " mass = "
                    + planets.getMass() + " kg, radius = " + planets.getRadius() + " m");
        }

        System.out.println("--------------------");

       // 4. Write a method called getDayType that takes a Weekday enum as a parameter
        // and returns a string indicating whether it's a "Weekday" or "Weekend."

        Weekday monday = Weekday.MONDAY;
        System.out.println(Weekday.getDayType(monday));

        Weekday sunday = Weekday.SUNDAY;
        System.out.println(Weekday.getDayType(sunday));

        //Weekday invalidDay = null;
        // System.out.println(Weekday.getDayType(invalidDay)); Throw: Exception in thread "main" java.lang.NullPointerException: Cannot invoke "homeworkLesson13.Weekday.ordinal()" because "day" is null
        //	at homeworkLesson13.Weekday.getDayType(Weekday.java:24)
        //	at homeworkLesson13.MainClass.main(MainClass.java:154)

        System.out.println("------------------");

        // Part III SOLID

        // 1. Create a Bird class with a method fly(). Extend it to create a Penguin class.
        // Make sure the Penguin class can be substituted for the Bird class without issues.

        Penguin penguin = new Penguin();

        System.out.println(penguin.peck());
        System.out.println(penguin.walk());

        System.out.println("-------------");


        // 2. Design a class hierarchy for shapes (circle, square, rectangle).
        // Ensure that subclasses can be used interchangeably with the base class.

        Circle circle = new Circle(4);
        System.out.println("Circle aria is: " + circle.computeArea());

        Square square = new Square(13);
        System.out.println("Square aria is: " + square.computeArea());

        Rectangle rectangle = new Rectangle(34, 45);
        System.out.println("Rectangle aria ia: " + rectangle.computeArea());

        System.out.println("------------------");

        // 3. Define an interface for a worker that has methods for both working and eating.
        // Break it into smaller interfaces to follow ISP.

        HumanWorker humanWorker = new HumanWorker();
        humanWorker.eating();
        humanWorker.working();

        RobotWorker robotWorker = new RobotWorker();
        robotWorker.working();

        System.out.println("---------------------");

        // 4. Create an interface for vehicles that includes methods for driving and refueling.
        // Apply ISP to split the interface into more focused interfaces.

        Bike bike = new Bike();
        bike.drive();

        Motorbike motorbike = new Motorbike();
        motorbike.refueling();
        motorbike.drive();

















    }
}
