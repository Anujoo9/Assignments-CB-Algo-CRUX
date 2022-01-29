package Assignment_2;
import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0 ; i<T ;i++){
        int n = sc.nextInt();
        int s1 = sumeven(n);
        int s2 = sumodd(n);
        if(s1%4==0 || s2%3==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }}
        public static int sumeven(int n ){
            int sum = 0 ;
            int c = 0;
            while(n !=0){
                c++;
                if(c%2==0){
                    int rem = n%10;
                    sum =sum + rem;
                }n/=10;
            }
            return sum;
        }
       public static int sumodd(int n){
           int sum =0;
           int c =0;
           while(n!=0){
               c++;
               if(c%2!=0){
                   int rem =n%10;
                   sum = sum + rem;
                   }n/=10;
           }return sum;
       }
    
}
