import java.util.*;
import java.io.*;
public class ArmStrong {
    public static void IsArmStrong(int n){
        int originalNum=n,res=0;
         int cube = 0;
         while(n>0){
            int digit = n%10;
            cube=digit*digit*digit;
            res+=cube;
            n/=10;
         }
         if(res==originalNum){
            System.out.println(true);
         }else{
            System.out.println(false);
         }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int T = scn.nextInt();
         for(int idx=0;idx<T;idx++){
             int n = scn.nextInt();
             IsArmStrong(n);
         }
    }
}