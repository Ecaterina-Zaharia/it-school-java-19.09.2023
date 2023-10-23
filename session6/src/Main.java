public class Main {
    public static void main(String[] args) {
        // This is an example of Object instantiation by calling a Constructor with parameters.
        Human human = new Human("Jerry", 15);

        // direct access to instance field because of default access modifier.
        // will print 'null' because the default value for uninitialized object reference.
        // for numeric values the default is 0 and for boolean is false.
        System.out.println(human.hairColor);

        // we can change the value using the '.' operator
        human.hairColor = "brown";

        System.out.println(human.hairColor); // will print 'brown'

        // This is how you call an instance method.
        // This will print
        human.sayHello();

        // This is how you call a getter (which is also an instance method)
        // String humanName = human.getName();
        // System.out.println(humanName);
        System.out.println(human.getName());

        // This is how you call a setter
        human.setName("George");
        System.out.println(human.getName()); // will print 'George'

        // We can create as many objects we want for a specific class.
        // Each object has its own values for the instance fields.
        Human human1 = new Human("John", 18);
        human1.sayHello();
    }
}