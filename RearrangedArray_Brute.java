import java.util.ArrayList;

public class RearrangedArray_Brute {
    public static int[] RearrangebySign(int[] nums) {
        int n = nums.length;
        // Define 2 vectors, one for storing positive
        // and other for negative elements of the array
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        // Positives on even indices, negatives on odd.
        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] result = RearrangebySign(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
