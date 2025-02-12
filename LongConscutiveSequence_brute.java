public class LongConscutiveSequence_brute {
    public static boolean linearSearch(int[] a, int num) {
        int n = a.length; // size of array
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }

    public static int longestConscutiveSequence(int[] nums) {
        int n = nums.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int count = 1;
            while (linearSearch(nums, x + 1) == true) {
                x += 1;
                count += 1;
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String args[]) {
        int[] nums = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        int result = longestConscutiveSequence(nums);
        System.out.println("the longest coscutive sequence is:" + result);
    }
}
