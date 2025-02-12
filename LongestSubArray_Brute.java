public class LongestSubArray_Brute {// it's code is a Brute solution for this code 
    public static int lOngestSubArray(int[] nums,int k)//where k is the value of sum which i find this in Largest sum array 
    {
        int length=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
        int sum=0;
         for(int j=i;j<n;j++){
           sum+=nums[j];
           if(sum==k){
            length=Math.max(length,j-i+1);// there are time complexity is O(n2)
           } 
         }
       }
       return length;
    }

    public static void main(String args[]){
        int[] nums={1,2,3,1,1,1,4,2,3};
        int k=10;
        int result=lOngestSubArray(nums,k);
        System.out.println(result);
    }
}
