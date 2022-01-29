package Assignment_3;

public class maxElementInArray {
    public static void main(String[] args) {
        int[] arr = {-1,-10,-29,-2};
        System.out.println(Max(arr));
        System.out.println(Integer.MAX_VALUE);
    }
    public static int Max(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }return max;
    }
    
}
