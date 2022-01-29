package Assignment_2;

public class sumofdigitatplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 2635;//11   5
		
		sum(n);
		
	}
	public static void sum(int n) {
		int sum1=0;
		int sum2=0;	
		int count =0;
		while(n!=0) {
			count++;
		int rem = n%10;
			if(count%2!=0)
		   {sum1=sum1+rem;}
			else 	{sum2= sum2+rem;}
			
			n/=10;}
	System.out.println("Sum of odd digit is "+sum2);
	System.out.println("Sum of even digit is "+sum1);
		
	}
	


}
