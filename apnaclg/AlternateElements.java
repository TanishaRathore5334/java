import java.util.Arrays;
public class AlternateElements {
        public static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {-5, 1, 4, 2, 12};

        System.out.println("Output for arr1:");
        printAlternateElements(arr1); // Output: 10 30 50

        System.out.println("\nOutput for arr2:");
        printAlternateElements(arr2); // Output: -5 4 12
    }
}
