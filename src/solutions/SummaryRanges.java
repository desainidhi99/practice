package solutions;
/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges,
and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b


Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
 */

/*
[0,1,2,4,5,7]
           i

 for(int i = 0; i < nums.length  ; i++){

 int lower = nums[i];


 if( nums[i + 1] - nums[i] == 1){
 int start = nums[i];

 while(i <= nums.length - 1 && nums[i + 1] - nums[i] == 1){
     i++;
 }
 int end = nums[i];

 }

 */


import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<String>();

        if(nums == null || nums.length ==0)
            return result;

        if(nums.length == 1){
            result.add(String.valueOf(nums[0]));
            return result;
        }

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i + 1] - nums[i] == 1 ){

                int start = nums[i];

                while(i < nums.length - 1 && nums[i+1] - nums [i] == 1){
                    i++;
                }
                int end = nums[i];
                result.add(String.valueOf(start) + "->" + String.valueOf(end));
            }else{
                result.add(String.valueOf(nums[i]));
            }



            if(i == nums.length - 2 && nums[i+1] - nums[i] != 1){
                result.add(String.valueOf(nums[nums.length-1]));
            }
        }
        return result;
    }
}

