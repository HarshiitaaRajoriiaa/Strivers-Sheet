public class MaxProductSubArray {
    //?https://leetcode.com/problems/maximum-product-subarray/
    // *BRUTE FORCE APPROACH-
    //! TC = 0(n^3)
    public static int maxProduct(int[] nums) {
        // generate all sub array can maintain a variable which take care of the maximum product all over the whole array
        int maxProduct = Integer.MIN_VALUE;  // initialize the maximum product with negative infinity.
        int length =0;
        // iterate through all sub arrays and calculate their product
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= nums[k];
                }
                // update the maximum product if it is less than the current product
                maxProduct = Math.max(maxProduct, product);
                length = j - i + 1;
            }
        }
        return maxProduct;
    }
    
    //! TC = 0(n^2)
    public static int maxProductBetter (int []  num){
        int maxProduct =1;
        for (int i = 0; i < num.length; i++) {
            int product = 1;
            for (int j = i; j < num.length; j++) {
                product *= num[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }


    //todo OPTIMAL APPROACH OBSERVATION BASED-
    // *if array has all positives or even negatives  maxProduct = product(arr[i])
    // *if array has odd negatives then we will consider suffix and prefix things left to that integer and right to that integer 
    // * if array hsa zero then same prefix and suffix approach
    public static int maxProductOptimized (int [] arr){
        int prefix =1;
        int suffix =1;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(prefix==0 ) prefix=1;
            if(suffix==0) suffix=1;
            prefix *= arr[i];
            suffix *= arr[arr.length-1-i-1];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
    }
}

