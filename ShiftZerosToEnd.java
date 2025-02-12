public class ShiftZerosToEnd {
    public static void shiftZerosToEnd(int[] arr) {
        int j = 0; // Position to place the next non-zero element

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not zero, place it at index j
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 5, 1, 0};
        shiftZerosToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
