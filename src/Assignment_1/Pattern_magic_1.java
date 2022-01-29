package Assignment_1;



public class Pattern_magic_1 {
    public static void main(String[] args) {
        
        int n=5;
		int nst1=2*n-1;
		int cst=1;
		while(cst<=nst1) {
			System.out.print("*");
			cst++;
		}
		System.out.println();
		int nst2=n-1;
		int nsp=1;
		int row =2;
		while (row<=2*n-1) {
			 cst=1;
			while (cst<=nst2) {
				System.out.print("*");
				cst++;
				
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			cst=1;
			if (row==2*n-1) {
				cst=2;
			}
			while (cst<=nst2) {
				System.out.print("*");
				cst++;
				
			}
			
			if (row<n) {
				nst2--;
				nsp+=2;
				
			}
			else {
				nst2++;
				nsp-=2;
				
			}
			System.out.println();
			row++;
			
		}
	
	

    }

    }	
	



