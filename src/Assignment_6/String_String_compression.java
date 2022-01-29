package Assignment_6;
import java.util.*;
//Same as String compression
public class String_String_compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbccdsee";
        String s =  compress(str);
        System.out.println(s);
     }
 
     public static String compress(String str){
         String ans = "";
 
         for(int i = 0 ;i<str.length();){
             char c = str.charAt(i);
             ans+=c;
             
            int sum= count(c,str,i);
             if(sum >1){
                 ans+=sum;
                 i+=sum;
             } 
             else{ 
                 i++;
             }
         }
         return ans;
     }
 
     public static int count(char c , String str,int i ){
         int sum = 1 ;
         for( ;i<str.length()-1;i++){
             if(str.charAt(i) == str.charAt(i+1)){
                 sum++;
             }
             else {
                 return sum;
             }
 
         }
         
         return sum;
     }
}
