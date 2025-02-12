public class SecondLargest {
    public static int secondLargest(int arr[]){
        int Largest=arr[0];
        int sLargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Largest){
                sLargest=Largest;
                Largest=arr[i];
            }else if(arr[i]<Largest && arr[i]>sLargest ){
                sLargest=arr[i];
            }
        }
        if(sLargest==Integer.MIN_VALUE){
            return -1;
        }else{
            return sLargest;
        }
        
    }
    public static void main(String args[]){
        int arr[]={10,10,10};
        int result=secondLargest(arr);
        System.out.println(result);
    }
    
}
