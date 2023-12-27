/*
 * 

HoW_Print count of digits and digits line by line.

You will be given a number greater than or equal to zero. Print the count of digits in the first line and then you have to print its digits from the digit at one’s place till the digit at the at the largest place value such that each digit should be printed in a separate line.

Input Format

For each test case, a number will be given.

Constraints

0 <= number <= 2^31-1
Output Format

Print as given in the problem statement.

Sample Input 0

7654
Sample Output 0

4
4
5
6
7
Sample Input 1

85439
Sample Output 1

5
9
3
4
5
8
Sample Input 2

8765430
Sample Output 2

7
0
3
4
5
6
7
8
 */

import java.io.*;
import java.util.*;

public class PrintCount {
    public static int countDigit(int num){
      int count = 0;
      while(num>0){
          count++;
          num/=10;
      }
        return count;
    }
    public static void PrintRev(int num){
        System.out.println();
        int n = 0;
        for(int idx=num;idx>0;idx/=10){
            n=idx%10;
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.print(countDigit(num));
        PrintRev(num);
    }
}