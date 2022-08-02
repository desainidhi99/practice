package solutions;
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 */

/*
  0 1 2
 [2,2,1]


Approach 1

[4,1,2,1,2]

4 xor 0 - 4
1 xor 1 - 0

c = 0

c = nums[i] xor c

 0 1 2 3 4
[1,1,2,2,4]
         i
 1 xor 0 - 1
 1 xor 1 - 0
 2 xor 0 - 2
 2 xor 2 - 0
 4 xor 0 - 4


Arrays.sort
loop and return if nums[i] != nums[i-1]

for(int i = 0; i < nums.length; i++){
if(nums [i] == nums [i+1]){
i++;
}
else{
return nums[i]
}
}
 */

public class SingleNumber {
}
