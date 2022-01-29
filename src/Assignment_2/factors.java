package Assignment_2;

public class factors {

	public static void main(String[] args) {
		
	
	
	int i = 2;
	int n2 =378;
	int sum2 =0;
	 while(i<=n2) {
	while(n2%i==0) {sum2 = sum2+ i;System.out.println(i); n2/=i;
	
	}i++;;
	 }System.out.println(sum2);
	 System.out.println(n2);
}
}