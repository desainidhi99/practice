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


        Constraints:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109
        0 <= k <= 105


 //
          0 1 2 3
 Input - [1,2,3,1] - k = 3
 nums[0] == nums[3] and abs(3-0) = 3

 //Approach
 map = {arr[i], i}
 for j in range 0 to n
    if map contains(arr[i])
        if abs(j - i ) <= k
          return true
    map.add{arr[j], j}

 return false
 */


