public class BuyAndSellStock {
    public static int buyAndSellStock(int[] nums) {
        int n = nums.length;
        int mini = nums[0];// (The first element of nums)
        int profit = 0;// Initial profit is 0
        for (int i = 1; i < n; i++) {
            int cost = nums[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, nums[i]);
        }
        return profit;
    }

    public static void main(String args[]) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int result = buyAndSellStock(nums);
        System.out.println(result);
    }
}