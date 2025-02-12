import java.util.Arrays;
import java.util.List;

class MaxWater11{
    public int maxArea(List<Integer> height)  {
        int maxWater=0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
            int w=rp-lp;
            int ht=Math.min(height.get(lp),height.get(rp));
            int currWater=w*ht;
            maxWater=Math.max(maxWater,currWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        MaxWater11 maxWaterCalculator = new MaxWater11();
        
        // Example input
        List<Integer> heights = Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7);
        
        int result = maxWaterCalculator.maxArea(heights);
        System.out.println("Maximum water that can be contained: " + result);
    }
}
