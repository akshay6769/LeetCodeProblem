public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int temp = arr[arr.length - 1];
        
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // Improved printing
        for (int x : arr) {
            System.out.print(x + " "); // Added space for better readability
        }
    }
}
