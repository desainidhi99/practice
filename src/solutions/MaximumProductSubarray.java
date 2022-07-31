package solutions;

/*
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product,
and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.


Example 1:

               0 1  2 3
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */
/*
               0 1  2 3
Input: nums = [2,3,-2,4]
                 i
                    j
                currentProduct = currentProduct * nums[j]
                if currentMax < currentProduct
                 currentMax = currentProduct
                else
                  break;

               i*j = 2*3 = 6
                    6 * -2 = -12
               i*j = 3 * -2 = -6
                     -6 * 4 = -24
               i*j = -2 * 4 = -8


 Approach 1 -
 int maxResult = Integer.MIN;

 for(int i = 0; i < nums.length - 1; i++){


    for(int j = i + 1; j < nums.length; j++){
        int temp = nums[i] * nums[j];

    }

 }

 */



public class MaximumProductSubarray {

    public int maxProduct1(int[] nums){

        if(nums == null || nums.length ==0)
            return 0;

        if(nums.length ==1)
            return nums[0];

        int maxProduct = nums[0];
        int currentProduct = nums[0];

        //[-2,3,-4]
        //  i


        for(int i = 0; i <= nums.length - 1; i++) {
            currentProduct = nums[i];
            if(maxProduct < currentProduct){
                maxProduct = currentProduct;
            }
            for(int j = i + 1; j < nums.length; j++){
                currentProduct = currentProduct * nums[j];

                if(maxProduct < currentProduct){
                    maxProduct = currentProduct;
                }
            }
        }
        return maxProduct;
    }





    public int maxProduct(int[] nums) {

        if(nums.length ==0)
            return 0;

        int minArray = nums[0]; // running product or previous product
        int maxArray = nums[0]; // current max
        int result = nums[0];
        // 0  1 2  3
        //[-2,3,-4, 2]
        //       i

        for(int i = 1; i < nums.length; i++)
        {
            int curr = nums[i]; //-4

            int temp = maxArray * curr; // -4 * 3 = -12
            //                   -4,  max( -12, -6)
            maxArray = Math.max(curr, Math.max(temp, minArray * curr)); //3
            //                  3,    min(-6, -6)
            minArray = Math.min(curr, Math.min(temp, minArray * curr));
            //                  3, -2
            //result = 3
            result = Math.max(maxArray, result);
        }

        return result;
    }


//Approach 3
    public int maxProduct2(int[] nums) {

        if(nums.length ==0)
            return 0;

        int minArray = 1; // running product or previous product
        int maxArray = 1; // current max
        int result = 1;
        // 0  1 2  3
        //[-2,3,-4, 2]
        //       i

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0){
                minArray = 1;
                maxArray = 1;
                continue;
            }

            int curr = nums[i];
            int temp = curr * maxArray;

            maxArray = Math.max(curr, Math.max(temp, minArray * curr));
            minArray = Math.min(curr, Math.min(temp, minArray * curr));

            result = Math.max(minArray, maxArray);
        }

        return result;
    }
}