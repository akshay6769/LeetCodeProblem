import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        
        // Step 1: Find the largest index `pivot` such that arr[pivot] < arr[pivot + 1]
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no such pivot exists, reverse the whole array (because it's the last permutation)
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the element from the right that is greater than arr[pivot]
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                // Swap the pivot with this element
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the elements from pivot + 1 to the end of the array to get the next permutation
        reverse(arr, pivot + 1, n - 1);
    }

    // Helper function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to reverse the array from index `left` to index `right`
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr1);
        System.out.println(Arrays.toString(arr1));  // Output: [2, 4, 5, 0, 1, 7]

        int[] arr2 = {3, 2, 1};
        nextPermutation(arr2);
        System.out.println(Arrays.toString(arr2));  // Output: [1, 2, 3]

        int[] arr3 = {3, 4, 2, 5, 1};
        nextPermutation(arr3);
        System.out.println(Arrays.toString(arr3));  // Output: [3, 4, 5, 1, 2]
    }
}

