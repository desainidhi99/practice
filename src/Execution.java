import solutions.TwoSum;

import java.util.Arrays;

public class Execution {

    public static void main(String[] args) {

        TwoSum twosum = new TwoSum();

        int[] resultArray = new int[6];
                            // 0 1 2 3 4 5
        int[] nums = new int[]{1,2,3,4,5,6};

        resultArray = twosum.twoSum(nums, 3);
        System.out.println("result Array" + Arrays.toString(resultArray));

        resultArray = twosum.twoSum(null, 1);
        System.out.println("result Array" + Arrays.toString(resultArray));

        resultArray = twosum.twoSum(new int[]{}, 1);
        System.out.println("result Array" + Arrays.toString(resultArray));


    }
}
