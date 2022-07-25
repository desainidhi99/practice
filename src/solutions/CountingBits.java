/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */


class Solution {
    public int[] countBits(int n) {

        int[] result = new int[n+1];
        int id =0;

        for(int i = 0 ; i <= n; i++){
            result[id++] = countOne(i);
        }

        return result;
    }

    public int countOne(int n){

        int count =0;

        while(n > 0){
            if ( (n % 2) != 0)
                count ++;
            n = n /2;
        }

        return count;
    }

}