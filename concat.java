/*Given x and y, print xy

Take x and y digits as integer inputs and then form a number xy from it and then finally print that number.

for eg. if you are the given 3 and 4, then you have to form the number 34 from it and then finally print the number 34.

Input Format

The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

For each test case,

Digit x will be given as an integer input in the first line,

Digit y will be given as an integer input in the second line.

Constraints

1 <= T <= 10^4

0 <= x , y <= 9
Output Format

Print the number xy as an integer output.

Sample Input 0

4
4 3
1 2
3 5
5 3
Sample Output 0

43
12
35
53
Sample Input 1

3
8 9
9 9
5 6
Sample Output 1

89
99
56 */


import java.io.*;
import java.util.*;

public class concat {
    public static int FindConcat(int x,int y){
        return 10*x+y;
    }

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int idx=0;idx<T;idx++){
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println(FindConcat(x,y));
        }
    }
}