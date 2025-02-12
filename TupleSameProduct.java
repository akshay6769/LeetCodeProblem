import java.util.HashMap;

public class TupleSameProduct {
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int count = 0;

        // Compute all unique product pairs and store their frequency
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Calculate the number of valid tuples from product frequencies
        for (int freq : productCount.values()) {
            if (freq > 1) {
                count += 8 * (freq * (freq - 1)) / 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 4, 6 };
        System.out.println(tupleSameProduct(nums1)); // Output: 8

        int[] nums2 = { 1, 2, 4, 5, 10 };
        System.out.println(tupleSameProduct(nums2)); // Output: 16
    }
}
