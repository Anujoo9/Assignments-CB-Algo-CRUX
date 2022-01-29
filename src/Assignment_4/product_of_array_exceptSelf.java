package Assignment_4;

public class product_of_array_exceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
       int p[] = product(arr);
       for(int val:p){
           System.out.print(val + " ");
       }
    }
    public static int[] product(int[] arr){
        int[] pleft = new int[arr.length];
        pleft[0] =1;
        for(int i = 1 ; i<arr.length;i++){
            pleft[i]= arr[i-1]*pleft[i-1];
        }
        int[] pright = new int[arr.length];
        pright[arr.length-1] = 1;
        for(int i = arr.length-2 ; i>=0;i--){
            pright[i] = pright[i+1]*arr[i+1];
        }
        int[] res = new int[arr.length];
        for(int i = 0 ; i<arr.length;i++){
            res[i] = pleft[i]*pright[i];
        }
        return res;
    }
    
}
