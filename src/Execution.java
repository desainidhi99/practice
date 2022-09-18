import solutions.*;

import java.util.Arrays;

public class Execution {

    public static void main(String[] args) {
        /*
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
        */

        /*
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        int[] nums = new int[]{2,3,-2,4};

        int result = maximumProductSubarray.maxProduct1(nums);
        System.out.println("result = " + result);

        int resultNull = maximumProductSubarray.maxProduct1(null);
        System.out.println("result = " + resultNull);

        int resultEmpty = maximumProductSubarray.maxProduct1(new int[]{});
        System.out.println("result = " + resultEmpty);

         */

    /*
        SumofTwoIntegers sumofTwoIntegers = new SumofTwoIntegers();
        int result = sumofTwoIntegers.getSum(2 ,1);

        System.out.println("result = " + result);
*/
        /*
        MeetingRooms nm = new MeetingRooms();

        int[][] intervals = new int[][]{{13,15},{1,13}};

        boolean x = nm.meetingRooms(intervals);

        System.out.println("Answer = " + x);
        /*
         */

        int[] nums = new int[]{1,2,3,1};
        int k = 3;

        ContainsDuplicateSecondPart csp = new ContainsDuplicateSecondPart();
        boolean value = csp.containsDuplicate(nums, k);

        System.out.println("Answer = " + value);

    }
}
