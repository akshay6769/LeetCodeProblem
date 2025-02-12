import java.util.HashSet;

public class ContainDuplicate {
    public boolean containDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // Check if the number is already in the set
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            // Add the number to the set
            seen.add(num);
        }
        
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ContainDuplicate obj = new ContainDuplicate();
        System.out.println(obj.containDuplicate(nums)); // Output: true
    }
}
