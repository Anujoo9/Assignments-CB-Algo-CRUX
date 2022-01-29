package Assignment_5;
import java.util.*;
public class pair_of_roses {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int[] arr ={40,50,30};
    int money = 80;
    Arrays.sort(arr);
    roses(arr,money);
   } 
   public static void roses(int[] arr, int target){
    int[] arr1 = new int[2];
    int left = 0 ; 
    int right = arr.length-1;
     arr1[0]=Integer.MAX_VALUE;
     arr1[1]=0;
    while(left<right){
        int temp =arr[left] + arr[right];
        if(arr[left]+ arr[right]==target){
            if(Math.abs(arr1[0]-arr1[1]) > Math.abs(left -right)){
                 arr1[0]=arr[left];
                 arr1[1]=arr[right];
            }
           
        }
        if(temp>target){
            right--;
        }
        else{
            left++;
        }
        
    }
    System.out.println("Deepak should buy roses whose prices are "+arr1[0]+" and "+arr1[1]+".");
}
}
/*
import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       while(T>0){
       int N = sc.nextInt();
       int[] arr = new int[N];
       for(int i = 0 ; i<arr.length;i++){
           arr[i]= sc.nextInt();
       }
       T--;
       int M = sc.nextInt();
      Arrays.sort(arr);
       roses(arr,M);
       }
      
   } 
   public static void roses(int[] arr, int target){
           int[] arr1 = new int[2];
           int left = 0 ; 
           int right = arr.length-1;
            arr1[0]=Integer.MAX_VALUE;
            arr1[1]=0;
           while(left<right){
               int temp =arr[left] + arr[right];
               if(arr[left]+ arr[right]==target){
                   if(Math.abs(arr1[0]-arr1[1]) > Math.abs(left -right)){
                        arr1[0]=arr[left];
                        arr1[1]=arr[right];
                   }
                  
               }
               if(temp>target){
                   right--;
               }
               else{
                   left++;
               }
               
           }
           System.out.println("Deepak should buy roses whose prices are "+arr1[0]+" and "+arr1[1]+".");
   }
  
}
    

 */