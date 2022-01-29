package Assignment_2;

import java.util.Scanner;

public class testprintseries {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1 = 10;
	int n2 = 4;
	print(n1,n2);
}

public static void print(int n1, int n2) {
int n=0;
int count =0;
int i=1;
	while (count!=n1) {
		n = (3*i)+2;
		if(n%n2!=0) {
			System.out.println(n);
				count++;
	}
		  i++;
		

}
}}