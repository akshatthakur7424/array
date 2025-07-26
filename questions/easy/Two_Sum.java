package questions.easy;

import java.util.Arrays;

public class Two_Sum {
    static int[] two_sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int target = 8;
        int[] indexes = two_sum(array, target);
        System.out.println("Indexes: " + Arrays.toString(indexes));
    }
}
