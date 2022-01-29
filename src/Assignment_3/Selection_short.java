package Assignment_3;
// import java.util.*;
public class Selection_short {
public static void main(String args[]) {
        int[] arr = {2,-18,45,30};
    selection_short(arr);
    for(int val : arr){
        System.out.println(val);
    }
    }
    public static void selection_short( int[] arr){
        for(int i = 0 ;i<arr.length;i++){// {5,4,3,2,1}
        int val = i;
       for(int j = i+1;j<arr.length;j++){
           if(arr[val] > arr[j]){
                val=j;
           }
           int temp = arr[val];
           arr[val] = arr[i];
           arr[i] = temp;
       }
        
    }

    }
}
