package Assignment_4;
import java.util.*;
// not accepted
public class Alext_goes_shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100 ,200 ,400, 100};
       for(int i = 0 ; i<5;i++){
           System.out.println("Money");
           int money = sc.nextInt();
           System.out.println("Claim");
           int claim = sc.nextInt();
           yes_no(arr,money,claim);
       }
    }
    public static void yes_no(int[] arr, int money, int claim){
        int count=0;
        for(int i = 0 ; i<arr.length;i++){
            int val = arr[i];
            if(money%val==0){
                count++;
            }
        }
        if (count==claim){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
