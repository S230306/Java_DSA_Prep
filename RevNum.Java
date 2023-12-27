/*Reverse a 3 digit number
Take in a three digit number as an integer input and reverse its digits. And then print the final reversed number as an integer output.

Input Format

The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

For each test case,

A three digit number will be given as an input.

Constraints

100 <= 3 digit number <= 999
Output Format

Print the final reverse 3 digit number as an integer output.

Sample Input 0

3
234
123
456
Sample Output 0

432
321
654
Sample Input 1

2
345
111
Sample Output 1

543
111
 */

 import java.io.*;
import java.util.*;

public class RevNum {
    public static void ReverseNum(int num){
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        System.out.print(rev);
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int idx=0;idx<T;idx++){
             int x = scn.nextInt();
           ReverseNum(x);
        }
    }
}