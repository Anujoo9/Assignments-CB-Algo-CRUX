package Assignment_1;
import java.util.*;
public class rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        n =2*n;
        if(n%2==0){n=n-1;}
        pattern(n);

    }
    public static void pattern(int n){
        int star=1;
        int space=n/2;
        int value =1;
        for(int i =1;i<=n;i++){
            int cvalue = value;
            for (int j =1;j<=space;j++){
                System.out.print("  ");
            }
             for (int j =1;j<=star;j++){
                System.out.print(cvalue+" ");
                if(j<=star/2){cvalue++;}
                else {cvalue--;}
            }
            
            if(i<=n/2){star+=2;space--;value++;}
            else {star-=2;space++;value--;}
            System.out.println();
        }
}}