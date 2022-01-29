package Assignment_3;
public class insertion_short {
public static void main(String[] args) {
    int[] arr = {5,4};
    Ishort(arr);
    for (int val : arr){
        System.out.println(val);
    }
}
   public static void Ishort(int[] arr){
       for(int count =1;count < arr.length; count++){
           int val = arr[count];
           int j = count -1;
           while(j>=0 && val < arr[j]){
               j--;
           }arr[j+1] = val;
       }

   }
    
}
