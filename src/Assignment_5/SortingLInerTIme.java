package Assignment_5;

public class SortingLInerTIme {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
    public static void sort(int[] arr){
        int head = 0;
        int mid = 1;
        int tail =2;
        int j = arr.length-1;
        int i = 0 ;
        while(i<arr.length){
            if(arr[i] < arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j]= temp;
                    }j--;i++;
        }
        // for(int i = 0 ; i< arr.length;i++){
        //     if(arr[i] == head&& arr[j]==tail){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j]= temp;
        //     }j--;
        // }
    }
    
}
