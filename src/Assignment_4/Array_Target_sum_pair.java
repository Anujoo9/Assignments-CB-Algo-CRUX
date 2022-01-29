package Assignment_4;
import java.util.*;
public class Array_Target_sum_pair {

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        pair(arr,k);

    }
    static void pair(int[] arr , int k){
        int left = 0;
        int right = arr.length-1;
        int[] ans = new int[2];
        while(left<right){
            int temp = arr[left]+ arr[right];
            if(temp==k){
                    ans[0]=arr[left];
                    ans[1]=arr[right];
                System.out.println(ans[0]+" and "+ ans[1]);
            }
            if(temp>k){
                right--;
            }else{
                left++;
            }

        }

    }
}    

