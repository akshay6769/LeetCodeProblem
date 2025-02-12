class FindMaximumProductSubarray {
    int maxProduct(int[] arr) {
        int n = arr.length;
        
        // Initialize the maximum and minimum product up to the first element
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0]; // This will store the global maximum product

        // Traverse the array from the second element
        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                // Swap maxProduct and minProduct if arr[i] is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the global result
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String args[]) {
        int[] arr = {2,3,4};
        FindMaximumProductSubarray f = new FindMaximumProductSubarray();
        int result = f.maxProduct(arr);
        System.out.println(result);
    }
}
