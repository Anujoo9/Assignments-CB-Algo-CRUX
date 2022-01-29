package Assignment_2;
public class bostonnumber {

	public static void main(String[] args) {
		System.out.println(check(378));
	
		

	}
	public static int check(int n) {
		int sum1=0;
		int n2=n;
		int sum2=0;
		while(n!=0) {
			int rem = n%10;
			sum1 = sum1 + rem;
			n/=10;
					}
		int i = 2;
		
			while(i<=n2) {
				while(n2%i==0) {
				sum2 = sum2+ i;
				n2/=i;}
			i++;}
			
			
			if (sum1==sum2) return 1;
			
			else return 0;	}
}
