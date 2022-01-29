package Assignment_2;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(20,44));

	}
	public static int gcd(int n1, int n2){
        int i =n1;
        int gcdd=1;
        while (i!=0){
            if (n1%i==0 && n2%i==0){
                gcdd=i;
                break;
            }
            i--;
            
            
           
        }
        return gcdd;

    }

}
