package Assignment_2;
import java.util.*;
public class any_to_any_base_converter {

	 public static void main(String args[]) {
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Eneter base ");
	        int sb = sc.nextInt();
	        System.out.println("Eneter new base ");
	         int db = sc.nextInt();
	         System.out.println("Eneter number");
	          int sn = sc.nextInt();
	        int n= any_ten(sb,sn);
	          System.out.println(any_ten(sb,sn));
	          System.out.println(ten_any(db,n));
	 }
	 public static int any_ten(int base , int num) {
		 int con =0;
		 int mul = 1;
		 while(num!=0) {
			 int rem = num%10;
			 con = con + rem*mul;
			 mul= mul*base;
			 num/=10;
		 }
		 return con; }
	 
	 public static int ten_any(int base, int num) {
		 int con=0;
		 int mul = 1;
		while(num!=0) {
			int rem = num%base;
			con= con + rem*mul;
			mul = mul*10;
			num/=base;
		}
		 return con;
}
}