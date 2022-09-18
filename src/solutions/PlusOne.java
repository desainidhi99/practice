package solutions;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.


Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */


/*

int carry = 0;
int[] result = new int[digits.length + 1];

          0 1
digits = [1,0,0]
        l
          c=1
          for(int l = digits.length - 1; l >= 0; l--)
             if( l == digits.length -1) {
                 sum = digits[l] + 1 ; // 9+1 = 10
             }
             else{
                 sum = digits[l] + carry; // 9 + 1 = 10
                 carry = 0;
             }
             if(sum > 9)
                carry = 1;
                digits[l] = 0;
             l--

     if(carry == 1)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

   return digits;

 1
 99
 +1
 -----
 100

 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        if(digits == null || digits.length ==0){
            return new int[0];
        }

        int[] result = new int[digits.length + 1];
        int carry  = 0;

        for(int i = digits.length - 1 ; i >= 0; i--){
            int sum = 0;
            if(i == digits.length -1 ){
                sum = digits[i] + 1;

            }else{
                sum = digits[i] + carry;
                carry = 0;
            }

            if(sum > 9){
                digits[i] = 0;
                carry = 1;
            }else{
                digits[i] = sum;
            }

        }

        if(carry == 1){
            result[0] = 1;
            return result;
        }

        return digits;
    }

}
