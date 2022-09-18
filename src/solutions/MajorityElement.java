package solutions;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

/*
 0 1 2 3 4 5 6 7 8 9 10 11 12
[2,2,1,1,1,2,2,3,3,3,3,3,4]

[1,1,1,2,2,2,2,3,3,3,3,3,4]

Map<Integer, Integer> map = new HashMap<Integer, Integer>

for(int i = 0 )


 len = 7
 len/2 = 3

TC - O(n)
 */

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
