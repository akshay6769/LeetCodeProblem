public class JumpGame {
    public boolean canJump(int[] nums){
        int reachable=0;
        int n=nums.length;
        for(int i=0;i<n;++i){
            if(reachable<i){
                return false;
            }
            reachable=Math.max(reachable,i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        JumpGame obj=new JumpGame();
        System.out.println(obj.canJump(nums));
    }
    
}
