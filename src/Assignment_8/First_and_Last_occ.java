package Assignment_8;

public class First_and_Last_occ {
    public static void main(String[] args) {
        int[] arr = {1,2,32,4,2,5,2,5,25,25};
        int k = 2;
        System.err.println(first(arr,k,0));
        System.err.println(Last(arr,k,arr.length-1));
    }

    public static int first(int[] arr , int k , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        else{
            return first(arr,k,i+1);
        }
    }
   
    public static int Last(int[] arr , int k , int i){
        if(i == 0){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        else{
            return Last(arr,k,i-1);
        }
    }
}
