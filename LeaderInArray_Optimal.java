import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray_Optimal {
    public static int[] leaderinArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = nums[n - 1]; // Start with the last element as the maximum
        ans.add(max); // Add the last element as a leader

        // Traverse the array from second last element to the first element
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]); // Add to the leaders list
                max = nums[i]; // Update the new maximum
            }
        }

        // Reverse the list to get the leaders in correct order
        Collections.reverse(ans);

        // Convert ArrayList to int[] and return
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 22, 12, 3, 0, 6 };
        int[] ans = leaderinArray(nums);

        // Print the leaders
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
