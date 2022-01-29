package Assignment_2;

import java.util.Scanner;

public class vonneumanlovesbinary {//Binary to dec

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of inputs");
		int n = sc.nextInt();
		System.out.println("Binary Number ");
		for(int i=1; i<=n;i++) {
			int a =sc.nextInt();
			System.out.println(dec(a));
		}

	}
	public static int dec(int a) {
		int bin = 0, mul =1;
		
		while(a!=0) {
			int rem = a%10;
			bin = bin + mul*rem;
			mul = mul*2;
			a/=10;
		}return bin;
	}

}
