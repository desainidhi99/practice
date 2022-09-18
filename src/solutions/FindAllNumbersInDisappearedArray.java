package solutions;

import java.util.ArrayList;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers
in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
//
        0 1 2 3 4 5 6 7
nums = [4,3,2,7,8,2,3,1]

n = 8

Approach 1
                       0 1 2 3 4
- Arrays.sort  on nums[1 5 3 3 2]
                                i

- boolean b_array = new boolean[6]
            0     1       2     3     4    5
b_array = [true, true, true, true, false, true]


 */
public class FindAllNumbersInDisappearedArray{

    public int[] FindAllNumbersInDisappearedArray1(int[] nums){
        if(nums == null || nums.length == 0)
            return new int[]{};

        ArrayList<Integer> result_array = new ArrayList<>();
        int j =0;

        boolean[] b_array = new boolean[nums.length+1];
        b_array[0] = true;

        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            b_array[temp] = true;
        }

        for(int i = 0; i < b_array.length; i++){
            if(!b_array[i]){
                result_array.add(i) ;
            }
        }

        return  result_array.stream().mapToInt(i -> i).toArray();
    }
}