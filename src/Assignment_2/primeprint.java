package Assignment_2;
import java.util.*;
public class primeprint {
	public static void main(String args[]) {
	 // Your Code Here
    Scanner sc = new Scanner(System.in);
    int n1= sc.nextInt();
    for (int i =2; i<=n1;i++){
        if(prime(i)==0)
        {System.out.println(i);}
       
  
}

    }

public static int prime(int a){
    int count = 0;
    for (int i=2;i*i<=a;i++){
        if (a%i==0){
            count++;
            break;
        }
    }return count;
}
}
