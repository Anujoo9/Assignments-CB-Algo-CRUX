package Assignment_7;

public class String_diff_in_ASCII_code {
    public static void main(String[] args) {
        String str ="acb";
        diff(str);
    }
    
    public static void diff(String str){
        String ans = "";
        ans+=str.charAt(0);
        for(int i = 1 ; i< str.length();i++){
            char ch1 = str.charAt(i-1);
            char ch2 = str.charAt(i);
            int d = ch2-ch1;
            ans+=d;
            ans+=ch2;
        }
        System.out.print(ans);
    }
    
}
