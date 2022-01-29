package Assignment_5;
import java.util.*;
public class Assignment_ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string ");
    String str = sc.nextLine();
    boolean b= is_palindrome(str);
    System.out.println(b);
}
public static boolean is_palindrome(String str){
    int j = str.length()-1;
    for(int i = 0 ; i<str.length();i++){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }j--;
    }
    return true;
}
  }  
