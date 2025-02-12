/*
 * public class CountNumberOfBadPairs {
 * public long countBadPairs(int[] nums) {
 * int n = nums.length;
 * int badPair = 0;
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * if (i < j && j - i != nums[j] - nums[i]) {
 * badPair++;
 * }
 * }
 * }
 * return badPair;
 * }
 * 
 * public static void main(String args[]) {
 * int[] nums = { 1, 2, 3, 4, 5, 6 };
 * CountNumberOfBadPairs obj = new CountNumberOfBadPairs();
 * long result = obj.countBadPairs(nums);
 * System.out.println(result);
 * }
 * }
 * 
 * TIME complexity=O(N);
 */

/*
 * class Solution {
 * public long countBadPairs(int[] nums) {
 * long n=nums.length;
 * // Insert & count matches and add frequencies where (nums[i]-1)==nums[j]-j
 * HashMap<Integer,Integer>freq=new HashMap<>();
 * long goodPairs=0;
 * for(int i=0;i<n;i++){
 * int key=nums[i]-i;
 * if(freq.containsKey(key)){
 * goodPairs+=freq.get(key);
 * }
 * freq.put(key,freq.getOrDefault(key,0)+1);
 * }
 * long badPairs=n*(n-1)/2-goodPairs;
 * return badPairs;
 * }
 * }
 * T.C=O(N)
 */