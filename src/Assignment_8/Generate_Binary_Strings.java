package Assignment_8;
import java.util.*;
public class Generate_Binary_Strings {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        //   int t = sc.nextInt();
        // while(t>0){
        //     String str = sc.next();
        //     binary(str,0);
        //     t--;
        // }
    String str = "1??0?101";
     binary(str, 0);
}
public static void binary(String str,int index){
    if(index == str.length() ){
        System.out.print(str+ " ");
        return ;
    }
   
    if(str.charAt(index)=='?'){
          binary(str.substring(0,index)+'0'+str.substring(index+1) , index+1);
        binary(str.substring(0,index)+'1'+str.substring(index+1) , index+1);
    }
    else{
       binary(str,index+1);
    }
   
}
    
}
