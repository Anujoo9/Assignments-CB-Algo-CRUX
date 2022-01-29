package Assignment_1;
// import java.util.*;

public class pattern_magic {

	public static void main(String[] args) {
		int n =10;
//		if(n%2==0) {n=n+1;}
//		n=2*n-1;
		int star = n/2;
		int ispace=-1;
		for(int i =1;i<=n;i++) {
			
			for (int j=1;j<=star;j++){System.out.print("* ");}//for first 4 star
			System.out.print("* ");//next 5th star
			for (int j=1;j<=ispace;j++){System.out.print("- ");}//then dash initiated from -1
			for (int j=1;j<=star;j++){System.out.print("* ");}//next 4 stars;
			if(i>1&& i<n ) {System.out.println("* ");}//4 star in last line
			
			
			if(i<=n/2) {star--;
			
			ispace+=2;}
			else {star++;;ispace-=2;}
			System.out.println();
		} 
		   
	}}
	