package solutions;/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


   */


import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
/*
  Approach 1-
 0 1 2 3
[1,2,3,1]
 i
   j
   nums[i] == nums[j] - ret true
   O(n^2)

   Approach 2 -
   Sort array . Arrays.sort() - O(n log n)
    0 1 2 3
    [1,1,2,3]
    for(int i = 0; i < nums.length-1; i++)
    if(nums[i] == nums[i+1]) return true
    after for loop - return false;
    TC - O(n log n)

    Approach 3 -
    Empty Set
    for(int i = 0; i < nums.length; i++)
    if(set.contains(nums[i])) return true
    else set.add(nums[i])

    after for loop = return false
    TC - O(n)
 */

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i=0; i< nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}