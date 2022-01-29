package Assignment_7;

public class next_permuation {
    public static void main(String[] args) {
        int[] arr = { 3,2,1 };
        nexP(arr);
        for(int val: arr){
            System.out.print(val +  " ");
        }
    }

    public static void nexP(int[] arr) {
        int p = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        int q = 0;
        for (int i = arr.length - 1; i >p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        if(p==0 && q==0){
            reverse(arr,0,arr.length-1);
            return;
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        reverse(arr,p+1,arr.length-1);

    }
    public static void reverse(int[] arr , int h, int t){
        while(h<=t){
           int temp =  arr[h] ;
           arr[h] = arr[t];
           arr[t] =temp;
           h++;
           t--;
        }
    }

}
