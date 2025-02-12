import java.util.*;

public class TcsCodeVita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the binary string
        String binaryString = sc.nextLine();
        int n = binaryString.length();

        // Read the worth of characters
        int[] worth = new int[n];
        for (int i = 0; i < n; i++) {
            worth[i] = sc.nextInt();
        }

        // DP arrays to track the maximum worth of alternating substrings
        long[] dp0 = new long[n]; // Ending with '0'
        long[] dp1 = new long[n]; // Ending with '1'

        // Initialize the first position
        if (binaryString.charAt(0) == '0') {
            dp0[0] = worth[0]; // Keep '0' at the first position
        } else {
            dp1[0] = worth[0]; // Keep '1' at the first position
        }

        // Iterate over the string
        for (int i = 1; i < n; i++) {
            char currentChar = binaryString.charAt(i);
            if (currentChar == '0') {
                // If we can add this '0' to a previous alternating string that ends with '1'
                dp0[i] = dp1[i - 1] + worth[i];
                // We also have the option of removing the '0', keeping the previous best dp0
                dp0[i] = Math.max(dp0[i], dp0[i - 1]);
            } else {
                // If we can add this '1' to a previous alternating string that ends with '0'
                dp1[i] = dp0[i - 1] + worth[i];
                // We also have the option of removing the '1', keeping the previous best dp1
                dp1[i] = Math.max(dp1[i], dp1[i - 1]);
            }
        }

        // The maximum worth of the largest alternating string
        long maxAlternatingWorth = Math.max(dp0[n - 1], dp1[n - 1]);

        // The total worth of the binary string
        long totalWorth = 0;
        for (int i = 0; i < n; i++) {
            totalWorth += worth[i];
        }

        // The sum of the worth of the characters to be deleted
        long toDeleteWorth = totalWorth - maxAlternatingWorth;

        // Output the result
        System.out.println(toDeleteWorth);
    }
}
