public class RotateArrayOptomal {

    // Helper function to reverse elements between start and end indices
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        // Handle the case where d is larger than array size
        d = d % n;
        reverse(arr, 0, d - 1);  // Reverse the first d elements
        reverse(arr, d, n - 1);  // Reverse the remaining elements
        reverse(arr, 0, n - 1);  // Reverse the entire array
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d); // Rotate the array
        // Print the rotated array
        for (int i : arr) {
            System.out.print(i + " "); // Print each element with a space
        }
        System.out.println(); // Newline after printing the array
    }
}
