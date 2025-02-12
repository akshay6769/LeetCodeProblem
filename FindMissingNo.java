public class FindMissingNo {
    public static int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < N; i++) {
            xor2 = xor2 ^ a[i];  // XOR of array elements
        }

        // XOR numbers from 0 to N (inclusive)
        for (int i = 0; i <= N; i++) {
            xor1 = xor1 ^ i; // XOR of [0...N]
        }

        return (xor1 ^ xor2); // XOR the results to get the missing number
    }

    public static void main(String args[]) {
        int N = 2;    // Corrected value for N, length of array + 1
        int a[] = {0, 1};  // Given array

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
