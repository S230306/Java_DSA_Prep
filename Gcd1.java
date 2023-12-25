import java.util.*;
import java.io.*;
public class Gcd1 {
    public static void FindGCD(int a,int b){
        int numretor = a, denominator = b;
        while(numretor%denominator != 0){
            int rem = numretor%denominator;
            numretor = denominator;
            denominator = rem;
        }
        System.out.println(denominator);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            for(int idx=0;idx<T;idx++){
                int x = scn.nextInt();
                int y = scn.nextInt();
                FindGCD(x,y);
            }
    }
    }

