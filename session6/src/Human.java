// This is the class definition
// we are allowed to have at most a single public class within a '.java; file
// the class name should start with a capital letter,
// the fields and methods must be written within the curly braces. (class context)
public class Human {

    // this is a static variable, and it is class-specific
    // if we try to change it via an instance, the value will be changed for all instances
    // we should not call this variable via instances, we should strictly call it via class.
    // this variable will keep a counter of how many instances are created.
    public static int counter = 0;

    // here is the instance fields area
    // the access modifier here is 'private' meaning that these fields can be referred directly only within this class.
    // the default access modifier allows access to these fields to any other class within the same package (folder).
    // the public access modifier allows access everywhere
    // the protected access modifier works almost the same as the default one, but it allows outside-of-package access for subclasses.
    private int age;
    private String name;

    // this has the default access modifier, and
    // this attribute can be used directly in other class
    // within the same package by simply using the '.' operator.
    String hairColor;

    // this is a constructor. a class can have multiple constructors with different number of parameters.
    // it is a special kind of method, it doesn't return any value so the return type from the method signature is missing.
    // it creates an instance of a specific type.
    // it can also have an access modifier
    // in this case, I don't want it to be accessible from the exterior, because it could lead to uncontrolled counter increases.
    private Human() {
        counter++;
    }

    // this is a constructor with parameters
    // we can call other constructors within a constructor, but the instruction must be the first line within the constructor.
    // the call to 'this()' will increment the counter for any newly created instance.
    // 'this' can also be used in combination with '.' operator and refers to the current object and can access the instance variables.
    public Human(String name, int age) {
        this();
        this.age = age;
        this.name = name;
    }

    // this is an instance method and have direct access to instance fields and also to other instance methods.
    // you can observe that the static variable has an 'italic' style.
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and there are " + counter + " other humans like me.");
    }

    // this is an example of 'getter'.
    // it has a return type corresponding to the desired variable's type.
    // in our case, the return type is int because we want to retrieve the instance field 'age' which is of type int.
    // the name should be something like 'get[Field]' (not mandatory, but recommended)
    // also it generally doesn't take any parameter
    public int getAge() {
        return age;
    }

    // this is an example of 'setter'.
    // the return type is void because this method is used to set an instance field.
    // the name should be 'set[Field]' (not mandatory, but recommended)
    // generally it should take a parameter, being the value to be set for our instance field.
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // this is a static method and use the static variable within it.
    // you cannot you non-static variables/methods in static contexts.
    // the opposite is allowed.
    public static void doSomethingInStaticMethod() {
        System.out.println("There are " + counter + " in the world!");

        // won't compile as static doesn't require an instance to be created
        // System.out.println(this.name);
    }
}