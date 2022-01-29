package Assignment_2;

import java.util.Scanner;

public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		System.out.println("Enter the Number to be counted ");
		int num = sc.nextInt();
		System.out.println(count(digit , num));

	}
	public static int count(int digit, int num) {
		int count =0;
		while(digit!=0)
		{
			int rem = digit%10;
			if (rem==num) {
				count++;
			}else {count=count;}
			digit/=10;
		}
		return count;
		
	}
	

}
