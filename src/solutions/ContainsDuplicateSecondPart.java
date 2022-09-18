package solutions;

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

/*
  0 1 2 3
 [1,2,3,1,1,1], k = 2
          i

  Map<Integer, Integer> map
  1, 3
  2, 1
  3, 2


 */

import java.util.HashMap;

import java.util.Map;


public class ContainsDuplicateSecondPart {
    public boolean containsDuplicate(int[] nums, Integer k) {

        if(nums == null || nums.length == 0)
            return false;
        if (k == null)
            return false;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && (Math.abs(i - map.get(nums[i])) <= k))
                    return true;
            map.put(nums[i], i);
        }

        return false;
    }
}
