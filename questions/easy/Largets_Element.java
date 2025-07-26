package questions.easy;

public class Largets_Element {
    static int largest_element(int[] nums) {
        int largest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[largest]) {
                largest = i;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 3, 4, 6, 3, 4, 0 };
        int index = largest_element(arr);
        System.out.println("Largest Element Index: " + index);
    }
}
