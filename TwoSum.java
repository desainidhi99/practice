/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
Each input would have exactly one solution, and you may not use the same element twice.
Return the answer in any order
*/

class TwoSum {

    /*
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    *  0 1  2  3
    * [2,7,11,15]
    * a+b =c , c>a,b
    * a = c-b
    * b = c- a
    * 2 + 7 = 9
    * 2 = 9-7
    *  0 1  2  3
    * [2,7,11,15]
    *  i (for key retrival - map is O(1))
    * map = {{2,0}, {7,1} }
    * */

    public int[] twoSum(int[] nums, int target) {

        //for null + empty size check
        if(nums == null || nums.length == 0)
        {
            return new int[]{};
        }

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        { //0 = 9-2, {2,0}
            //1= 9-7, 2
            int diff = target - nums[i];
            if(!map.containsKey(diff))
            {
                map.put(nums[i],i);
            }else{
                return  new int[]{i, map.get(diff)};
            }


        }

        return new int[]{};
    }
}