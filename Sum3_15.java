import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Sum3_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1; // Left pointer
            int right = nums.length - 1; // Right pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
    
          }
    
        return result;
    }
    public static void main(String[] args) {
        Sum3_15 obj = new Sum3_15();
        int[] numsArray = {1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = obj.threeSum(numsArray);
        
        System.out.println(triplets);
    }
}