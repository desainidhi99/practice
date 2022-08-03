package solutions;

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



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

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSecondPart {
    public boolean containsDuplicate(int[] nums) {

        if(nums == null || nums.length == 0)
            return false;

        Set<Integer> set = new HashSet<Integer>();


        for(int i = 0; i < nums.length; i++){
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }


        return false;
    }
}
