/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:

nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

  0 1 2 3  4  5
[-1,0,1,2,-1,-4]
  i
    j
      k

for(int i = 0; i< nums.length-2; i++)
  for(int j = i+1; j < nums.length -1; j++)
    for (int k = j+1; k < nums.length -1; k++)
      if( nums[i]+ nums[j]+ nums[k] == 0 )
      List<Int> temp
      if result.containsAll(temp) - continue
        result.add(nums[i], nums[j], nums[k])

 // remove duplicates from result


TC (O n^3)

Approach 2 -
Sort the array -
  0 1 2 3  4  5
[-1,0,1,2,-1,-4]
[-4,-1,-1,0,1,2]
        i
          j
            k

low = 0
high = nums.length
[-4,-1,-1,0,1,2]
 first
        low
               high
while(low < high)
    mid = low+ high/2
    sum = -4 + -1 + 2 = -3
    if(sum < 0) // check the duplicates for high and low
     low ++

TC - O(n)

 */


class Solution {
    private  List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);


        for(int i=0; i< nums.length -2 && nums[i] <=0; i++)
        {
            if(i==0 || nums[i] != nums[i-1])
            {
              int low = i+1;
              int high = nums.length-1;

              // nums[i]+ nums[j] +nums[k]
              int sum = 0-nums[i];

              if(nums[low] + nums[high] == sum)
              {
                  result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                  while( low < high && nums[low] == nums[low+1] )
                      low ++;
                  while(low < high && nums[high] == nums[high-1])
                      high--;

                  low++;
                  high--;

             }
            }
        }

        return result;
    }


}