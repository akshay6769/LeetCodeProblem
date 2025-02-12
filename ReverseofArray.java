class ReverseofArray {
    public static int[] reverseArray(int arr[]) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] result = reverseArray(nums);
        
        // Print the reversed array
        for(int t : result) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
