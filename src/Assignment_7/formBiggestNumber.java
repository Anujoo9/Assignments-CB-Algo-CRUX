package Assignment_7;

import java.util.*;

public class formBiggestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,98));
        Collections.sort(arr);   
        System.out.println(BigNum(arr));
    }

    public static String BigNum(ArrayList<Integer> arr) {
        String ans = "";
        int i =0;
        while(arr.size()>0 ){
          int max = arr.get(i);
          for(int j = i+1; j<arr.size();j++){ 
            max = findG(max, arr.get(j));
          }
          ans+=max;
          arr.remove(Integer.valueOf(max));
       }

        return ans;
    }

    public static int findG(int val1, int val2) {
        int i = 0;
        int j = 0;
        int a = val1;
        int b = val2;
        while (val1 > 0 && val2 > 0) {
            String s1 = Integer.toString(val1);
            String s2 = Integer.toString(val2);
            long ans1 = s1.charAt(i) - '0';
            long ans2 = s2.charAt(j) - '0';
            i++;
            j++;
            val1 /= 10;
            val2 /= 10;
            if (ans1 == ans2) {
                return b;
            } else if (ans1 > ans2) {
                return a;
            } else {
                return b;
            }
        }
        return -1;
    }
}
