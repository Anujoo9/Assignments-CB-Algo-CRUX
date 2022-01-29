package Assignment_2;

public class lcm {
	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 6;
		System.out.println(lcm(n1,n2));}
	
	 public static int lcm(int n1 ,int n2){
	        int i = 2;
	        int l=0;
	        while(i<=n1*n2){
	            if (i%n1==0 && i%n2==0)
	            	{l=i; break;}
	            else i++;
	       
	      
	        }
	        return l;

}
}