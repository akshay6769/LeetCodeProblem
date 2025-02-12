import java.util.Arrays;

public class FindEvenOdd {
    public static void findEvenOdd(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;
        // Count even and odd numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create arrays to hold even and odd numbers
        int[] nums1 = new int[evenCount];
        int[] nums2 = new int[oddCount];

        int evenStart = 0, oddStart = 0;
        
        // Distribute the numbers into the even and odd arrays
        for (int num : nums) {
            if (num % 2 == 0) {
                nums1[evenStart] = num;
                evenStart++; 
            } else {
                nums2[oddStart] = num;
                oddStart++;
            }
        }

        // print containing both nums1 (even) and nums2 (odd)
        System.out.println("Even numbers: " + Arrays.toString(nums1));
        System.out.println("Odd numbers: " + Arrays.toString(nums2));
        
    }

    public static void main(String args[]) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        findEvenOdd(nums);
    }
}
