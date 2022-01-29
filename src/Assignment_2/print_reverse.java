package Assignment_2;

public class print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123456789));
	
	}
	public static int reverse(int num) {
		int rev = 0;

		while(num!=0) {
			int rem = num%10;
			
			rev = rev*10 + rem;
			
		
			num/=10;
		
		}
				return rev;
	}
	
	

}
