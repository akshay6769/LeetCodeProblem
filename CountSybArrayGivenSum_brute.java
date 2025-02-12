import java.util.*;

public class CountSybArrayGivenSum_brute {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0; i < n; i++) { // starting index i
            for (int j = i; j < n; j++) { // ending index j

                // calculate the sum of subarray [i...j]
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int k = 2;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
