import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionArray {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("One Dimensional Array Creation");

        // Declaring , Instantiating and Initialising One Dimensional Array.

        // First Way :-
        // int[] array1 = new int[2]; // First way of declaring and instantiating an
        // array.

        // Second Way :-
        int[] array1 = { 12, 24 }; // Second way of declaring and instantiating + initialising an array. In this
                                   // case the memory allocation deponds on the data given.

        // another way of initialising an array.
        // array1[0] = 12;
        // array1[1] = 23;

        // Printing elements of Array.
        System.out.println(array1[0] + " " + array1[1]);
        System.out.println();

        // Taking input values from user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size for your Array :- ");
        int arraySize = scanner.nextInt();

        int[] array2 = new int[arraySize];
        
        // Taking input
        System.out.println();
        for (int i = 0; i < arraySize ; i++) {
            System.out.print("Enter the element at " + i + " index : ");
            array2[i] = scanner.nextInt();
        }

        // Printing array
        System.out.println();
        System.out.println("Printing the elements of Array using for loop.");
        // printing array using for loop.
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Element at " + i + " index : " + array2[i]);
        }
        // printing array using for-each loop.
        System.out.println("Printing the elements of Array using For-Each Loop.");
        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();
        // printing elemets using toString method
        System.out.println("Printing elements of Array using toString method.");
        System.out.println(Arrays.toString(array2));


        scanner.close();
    }
}