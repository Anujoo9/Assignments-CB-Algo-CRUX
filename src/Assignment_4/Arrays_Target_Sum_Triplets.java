package Assignment_4;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 1, 2 ,4 ,6 ,8, 3};
        int target = 10;
        valshort(arr);
         triplets(arr,target);
        
       
        System.out.println("god");
    }
//     1, 2 and 7
// 1, 3 and 6
// 1, 4 and 5
// 2, 3 and 5
    public static void triplets(int[]arr , int target){
        for(int i = 0 ;i<arr.length;i++){
            int val1 = arr[i];
            for(int j = i+1 ;j<arr.length;j++){
                int val2= arr[j];
                for(int k = j+1 ;k<arr.length;k++){
                    int val3 = arr[k];
                    if(val1+val2+val3==target){
                    
                      System.out.println(val1 +", " + val2 +", " +"and" +" " +val3); 
                    }
                }
            }
        }
    }
    public static void valshort(int[] arr){
            for(int i = 1 ;i<arr.length;i++){
               for(int j = 0 ;j<arr.length-i;j++){
                   if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }}
            }
    }
}








/*

*/
