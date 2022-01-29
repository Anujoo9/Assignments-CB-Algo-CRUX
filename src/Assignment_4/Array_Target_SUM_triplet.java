package Assignment_4;
// more efficient using pointers
public class Array_Target_SUM_triplet {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 1, 2 ,4 ,6 ,8, 3};
        int target = 10;
        bubble(arr);
         triplets(arr,target);
       
        System.out.println("god");
    }
//     1, 2 and 7
// 1, 3 and 6
// 1, 4 and 5
// 2, 3 and 5
    public static void triplets(int[]arr , int target){
        for(int i = 0 ;i<arr.length;i++){ 
           int l = i+1;                                        
           int r = arr.length-1;
           while(l<r){
               if(arr[i] + arr[l] + arr[r] == target){
                System.out.println(arr[i] +", "+ arr[l]+", " +"and "+arr[r]);
                l++;
                r--;
               }
               else if(arr[i] + arr[l] + arr[r] < target){
                   l++;
               }else{
                   r--;

               }

           }

        }
    }
    public static void bubble(int[] arr){
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
