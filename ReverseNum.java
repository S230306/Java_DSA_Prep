/*
 *Q3: Print digit by digit of a three digit number

Given a three-digit positive number. Print its digits one by one starting from the digit at one’s place to the digit at hundred’s place in a separate line.

Input Format

For each test case, A three digit number will be given as a positive integer input.

Constraints

100 <= 3 digit number <= 999
Output Format

Print the digits one by one as an integer output in separate lines.

Sample Input 0

345
Sample Output 0

5
4
3
Sample Input 1

987
Sample Output 1

7
8
9
Sample Input 2

654
Sample Output 2

4
5
6
Sample Input 3

352
Sample Output 3

2
5
3
Sample Input 4

197
Sample Output 4

7
9
1
 */
import java.io.*;
import java.util.*;

public class ReverseNum {
    public static void PrintSepNum(int num){
        int n = 0;
        for(int idx=num;idx>0;idx/=10){
            n=idx%10;
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        PrintSepNum(num);
    }
}
    
