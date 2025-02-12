public class FindConseculeOnes {
    static int findConseculeOnes(int[] nums) {
        int max_count = 0;
        int current_count = 0;
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current_count++; // Increment the count if it's a 1
            } else {
                max_count = Math.max(current_count, max_count); // Update max_count
                current_count = 0; // Reset current_count after encountering 0
            }
        }
        
        // Final check to update max_count in case the array ends with 1's
        max_count = Math.max(current_count, max_count);
        
        return max_count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1}; // Example input
        int result = findConseculeOnes(nums); // Call the method
        System.out.println("Consecutive ones are: " + result); // Output the result
    }
}
