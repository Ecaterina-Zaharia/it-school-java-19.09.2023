package homeworkLesson13;

// 2. Write a Java program to create a generic method that takes two arrays of the same type
// and checks if they have the same elements in the same order (pass different types).

public class CopmareArrays {

    public static <T> boolean compareArrayMethod(T[] arr1,T[] arr2 ){
        if (arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
}
