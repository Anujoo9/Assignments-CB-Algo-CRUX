package Assignment_7;

public class subarry_product_less_than_K {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;
        System.out.println(pro(arr,k));
    }
    public static int pro(int[] arr, int k){
        int ans = 0;
        int r = 0 ;
        int l = 0;
        int mul = 1;
        while(r<arr.length){
            mul*=arr[r];// increase windows size

            while(mul>=k && r>=l){ // decrease window size
                 mul/=arr[l];
                l++;
            }
            ans +=(r-l+1); // set answer
            r++;
        }
        return ans;
    }
    
}
