package solutions;

/*

You are given an inclusive range [lower, upper] and a sorted unique integer array nums, where all elements are in the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in nums.

Return the smallest sorted list of ranges that cover every missing number exactly. That is, no element of nums is in any of the ranges, and each missing number is in one of the ranges.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

nums = [0,1,3,50,75], lower = 0, upper = 99 --- [0,99]

 */

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> result = new ArrayList<String>();

        if((nums == null || nums.length == 0) && lower != upper)
        {
            result.add(formatresult(lower,upper));
            return result;
        }

        if((nums == null || nums.length == 0) && lower == upper)
        {
            result.add(formatresult(lower,upper));
            return result;
        }


        if(lower < nums[0]){
            int start = lower;
            int end = nums[0] - 1;
            result.add(formatresult(start,end));
        }

        for(int i = 0; i < nums.length - 1; i++){

            int start = nums[i] + 1;
            if(nums[i+1] - nums[i] > 1){
                int end = nums[i+1] -1;

                result.add(formatresult(start, end));
            }

        }


        if(upper > nums[nums.length - 1]){
            int start = nums[nums.length - 1] + 1;
            int end = upper;
            result.add(formatresult(start,end));
        }


        return result;
    }

    public String formatresult(int start, int end){

        if(start == end)
            return String.valueOf(start);
        return start + "->" + end;
    }

}
