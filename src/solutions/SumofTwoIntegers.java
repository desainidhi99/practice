package solutions;/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.



Example 1:

Input: a = 1, b = 2
0001
0010
-----
0011 --

Output: 3
Example 2:
0011
0010
------
0101

Input: a = 2, b = 3
Output: 5
 */

/*
int[] binary = new int[35];
num = 4
while (num > 0) {
            binary[id++] = num % 2; 4 % 2 = 0  2 % 2 = 0 ; 1 % 2 = 1
            [0 0 1]
            num = num / 2;  4 / 2 = 2 ; 2 / 2 = 1 ; 1 / 2 = 0.5
        }

 */

/*
 a = 1, b = 2
 String a = Integer.toBinaryString(a);
 String b = Integer.toBinaryString(b);

 char[] a1 = a.toCharArray()
 char[] b1 = b.toCharArray()

 int carry = 0 ;

StringBuilder sb

 a1 = 0001
         i
 b1 = 0010
         j
------------
       0011

// 1 xor  0 ==> 1
// 0 xor  1 ==> 1
// 1 xor  1 ==> 0
// 0 xor  0 ==> 0


 a = 2, b = 3

 a1 = 0110
         i
 b1 = 0111
         j
------------
   act = 0001
   exp = 0101

// 1 xor  0 ==> 1
// 0 xor  1 ==> 1
// 1 xor  1 ==> 0
// 0 xor  0 ==> 0

int carry = 0;

for(int i = a1.length -1; i >=0 ; i--){

    char temp = a1.charAt(i) xor b1.charAt(i)
    if(carry == 1){
       temp = temp OR carry
    }

    sb.append(temp);
    if (temp == 0 && (a1.charAt(i) && b1.charAt(i)) == 1 ){
       carry = 1;
    }

}


 */

public class SumofTwoIntegers {

    public int getSum (int a , int b){

        while( b != 0){
            int temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }

        return a;
    }



}