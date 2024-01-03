/*Q:Rotate 7-digit number to right by three
Take n as an integer input, you have to pick the last 3 digits of the number of and put them in the starting.

eg. 1234567 is given, then this number should transform to 5671234.

Input Format

The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

For each test case,

A 7 -digit number will be given as an integer input.

Constraints

1 <= T <= 10^4

Only 7-digit number will be given as input.
Output Format

Print the rotated number

Sample Input 0

3
2345678
1234567
9876543
Sample Output 0

6782345
5671234
5439876
Sample Input 1

2
1236789
1111111
Sample Output 1

7891236
1111111 */
import java.io.*;
import java.util.*;

public class Rotate {
    
    public static void rotateThreeLast(int num){
        int rem = num % 1000;
        int digit = num / 1000;
        System.out.println(rem+""+digit);
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int idx=0;idx<T;idx++){
            int num = scn.nextInt();
            rotateThreeLast(num);
        }
    }
}



