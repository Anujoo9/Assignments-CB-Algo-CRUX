package Assignment_4;

public class sort_arry_0_1_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 2 };
        sort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
            }
    }

    public static void sort(int[] arr) {
        int pt0 = 0;
        int pt1 = 0;
        int pt2 = arr.length - 1;
        while (pt1 <= pt2) {

            if (arr[pt1] == 0) {
               int temp = arr[pt1];
                arr[pt1] = arr[pt0];
                arr[pt0] = temp;
                pt0++;
                pt1++;
                
            }

            else if (arr[pt1] == 2) {
                int temp = arr[pt1];
                arr[pt1] = arr[pt2];
                arr[pt2] = temp;
                pt2--;
                
            } else {
                pt1++;
                
            }

        }

    }

    public static void JTP(int arr[], int arr_size) {
        int low = 0;
        int high = arr_size - 1;
        int mid = 0, temp = 0; // We use temporary variable for swapping
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: // Here mid pointer points is at 0.
                {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: // Here mid pointer points is at 1.
                    mid++;
                    break;
                case 2: // Here mid pointer points is at 2.
                {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void dutchNationalFlag(int[] array){
        int low,high,middle,temp;
        low = middle = 0;
        high = array.length-1;
        while(middle<=high){
                if(array[middle] == 0)
                {
                    temp = array[low];
                    array[low] = array[middle];
                    array[middle] = temp;
                    low = low + 1;
                    middle  = middle + 1;
                }
                else if(array[middle] == 1)
                    middle++;
                else
                {
                    temp = array[high];
                    array[high] = array[middle];
                    array[middle] = temp;
                    high = high - 1;
                }
        }

}

}