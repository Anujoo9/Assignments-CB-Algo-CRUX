package Assignment_7;

public class form_The_Biggest_Number {
    public static void main(String[] args) {
        int[] arr = { 9,98 };// all test cases work
        findBig(arr);
    }

    public static void findBig(int[] arr) {
        String ans = "";
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (big(arr[i],arr[i+1]) >0) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
        }
        }
         for (int i = arr.length-1; i>=0 ; i--) {
            ans += arr[i];
        }
        System.out.println(ans);
        }
 public static long big(int val1, int val2){
String s1 = "" ;
String s2 = "" ;
s1+=val1;
s2+=val2;
String e1 = s1+s2;
String e2 = s2 +s1;
long a1 = Long.parseLong(e1);
long a2 = Long.parseLong(e2);
return a1-a2;
}
}
// public static int big(int val1, int val2){
// String s1 = "" ;
// String s2 = "" ;
// s1+=val1;
// s2+=val2;
// String e1 = s1+s2;
// String e2 = s2 +s1;
// long a1 = Integer.parseInt(e1);
// long a2 = Integer.parseInt(e2);
// if(a1 - a2 >0){
// return val1;
// }else{
// return val2;
// }
// }