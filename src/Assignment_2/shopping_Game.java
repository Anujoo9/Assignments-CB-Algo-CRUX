package Assignment_2;
import java.util.*;
public class shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Test cases");
        int T = sc.nextInt();
        for(int i = 0 ;i <T;i++){
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Winner is " + game(m,n));
        }
    }
    public static String game (int m, int n){ //
        int m1 = 0;
        int n1 = 0;
        int i =1;
        while(m1 <=m && n1 <=n){ 
            m1+=i;
            i++;
            n1+=i;
            i++;
        }
        if(m1 >m){
            return "Harshit";
        }else {
            return "Aayush";
        }
        
    }
    
}
