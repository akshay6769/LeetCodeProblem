import java.util.Arrays;

public class SimpleArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Rotate the array 2 times clockwise
        rotateArray(arr, 2);
        
        // Output the rotated array
        System.out.println("Rotated array (clockwise): " + Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int times) {
        int n = arr.length;
        // Ensure times is within the length of the array
        times = times % n;

        // Rotate the array clockwise
        for (int i = 0; i < times; i++) {
            int lastElement = arr[n - 1]; // Store the last element
            // Shift elements to the right
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastElement; // Place the last element at the start
        }
    }
}
