public class BinarySearch {
    public static int firstOccurrence(int[] arr, int k) {
        int start = 0, end = arr.length - 1, result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5 };
        int k = 3;
        int result = firstOccurrence(arr, k);
        System.out.println(result); // Prints the first occurrence of 3 (should be 5)
    }
}
