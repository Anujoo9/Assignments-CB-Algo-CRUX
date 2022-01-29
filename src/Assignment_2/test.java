package Assignment_2;

import java.util.*;
public class test {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        //int n = sc.nextInt();
        if (check(378)) System.out.println("1");
         else 
        	 System.out.println("0");


    }
    public static boolean check(int n){
    	int n2 = n;
        int sum=0;
        while(n!=0){
            int rem= n%10;
            sum = sum+rem;
            n/=10;
        }
        int i = 2;
        
        int sum2=0;
        while(i<=n2){
            while(n2%i==0){
            sum2 = sum2 +i;
            n2/=i;}
            i++;
        }
        return sum==sum2;
    }
}