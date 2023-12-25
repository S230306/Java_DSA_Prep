/*Find GCD 3
Problem

Take two integer inputs x and y. Then print the gcd of these two numbers as an integer output.

Input Format

T will be given as an integer input representing the number of test cases.

For each test case,

x will be given as an integer input in the first line,

y will be given as an integer input in the second line.

Constraints

1 <= x , y <= 2^10
Output Format

Print the gcd as an integer output.

Sample Input 0

2
100 35
20 7
Sample Output 0

5
1
Sample Input 1

1
300 20
Sample Output 1

20 */
import java.io.*;
import java.util.*;
public class Gcd{
    public static int GCD(int a,int b){
        int numretor = a;
        int denominator = b;
        while(numretor%denominator!=0){
            int remainder = numretor%denominator;
            numretor = denominator;
            denominator = remainder;

        }
        return denominator;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int idx=0;idx<T;idx++){
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println(GCD(x,y));
        }
    }
}

