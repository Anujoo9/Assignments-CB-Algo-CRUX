package Assignment_2;

public class test2 {

	public static void main(String[] args) {
		
		int n=10;
		int x=4;
		int sum=0;
		for (int i=1; i<=n;i++) {
			sum = 3*i+2;
		if(sum%x!=0)
			System.out.println(i);
		}
	}
}

