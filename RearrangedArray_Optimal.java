import java.util.*;

public class RearrangedArray_Optimal {

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Define array for storing the ans separately.
        int[] ans = new int[n];

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Array Initialization.
        int[] nums = { 1, 2, -4, -5 };
        RearrangedArray_Optimal obj = new RearrangedArray_Optimal();
        int[] ans = obj.rearrangeArray(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}