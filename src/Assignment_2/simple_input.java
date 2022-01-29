package Assignment_2;

import java.util.Scanner;

public class simple_input {

	public static void main(String[] args) {
			//simple();
			Scanner s = new Scanner(System.in);
			while (true){
				int sum =0;
				int n=s.nextInt();
				sum=sum+n;
				if(sum<0){
					break;
				}
				System.out.println(n);}	}
			public static void simple(){
				Scanner sc = new Scanner(System.in);
				int sum =0 ;
				System.out.println("Enter number ");
				int[] n= new int[5];
				for(int i =0; i<n.length;i++){
				
					n[i] =sc.nextInt();
				}
				for(int j =0; j<n.length;j++){
					sum =sum+n[j];
					if(sum<-1){
							break;
						}else{System.out.println(n[j]);
							}
						
						
					}
		
			}
		}
	
	


