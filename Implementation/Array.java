import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Declaring and instantiating an array of size 5.
        int[] arr = new int[3];

        // Creating instance of Scanner class to take input.
        Scanner scanner = new Scanner(System.in);

        // Initialising the Array from the input given by the user.
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println("Enter the element of Array.");
            arr[i] = scanner.nextInt();

        }

        System.out.println("All the indexes in the array are filled Successfully.");
        System.out.println("Printing all the elements of the array.");

        System.out.println("");

        // Printing all teh elements of Array.
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println("Element at " + i + " index :- " + arr[i]);
        }
        
        System.out.println("Printing elements of array usin for each loop.");
        // Another way of accessing the elements of an array using For-Each Loop.
        for (int element : arr) {
            System.out.print(element + " ");
        }
        // Using for each loop you can directly access the element of the array instead
        // of getting the index and that using it to access the element of the array.
        // you cannot access the index using the for each loop.

        System.out.println("");

        System.out.println("Printing elements using toString method of array class");
        // Another way to print/access all the elements of the array.
        String arrayElement = Arrays.toString(arr); // Arrays is a class which has a toString method which takes array
                                                    // as an input, convert it to a string and than eventually returns
                                                    // that string. Thus we get all the elements of the array but in
                                                    // string format.
        System.out.println(arrayElement);

        scanner.close(); // closing scanner class.
    }
}
