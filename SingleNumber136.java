public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;  // The single number remains
    }

    public static void main(String[] args) {
        int[] nums = {0};
        SingleNumber136 obj = new SingleNumber136();
        System.out.println(obj.singleNumber(nums));  // Output: 3
    }
}

// DRY RUN
/*Iteration 1:

Current number (num): 1
Calculation: result = 0 ^ 1
Result: result = 1
Iteration 2:

Current number (num): 2
Calculation: result = 1 ^ 2
Result: result = 3 */

// becouse all numbber cinvert in binarynumber and same value remove the same other and 
//last number are not remove so ,is is once time value
