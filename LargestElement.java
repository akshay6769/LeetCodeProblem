public class LargestElement {
    public static int largestElement(int arr[]){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        return largest;
    }
    public static void main(String args[]){
        int arr[]={3,2,1,5,25};
        int result=largestElement(arr);
        System.out.println(result);

    }
    
}
