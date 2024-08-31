import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println();

        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(array2[0]));
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[0][0]);
        System.out.println(array2[0][1]);
        System.out.println(array2[0][2]);

        System.out.println();
        System.out.println("Two Dimensional Array Creation");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Rows in the Array : ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of Columns in the Array : ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element at " + (i + 1) + " row and " + (j + 1) + " column : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println("Printing the elements of Array :- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(Arrays.toString(array));
        // This method does not works with multi-dimensional arrays it is designed only for one dimensional array.

        scanner.close();
        System.out.println();
    }
}
