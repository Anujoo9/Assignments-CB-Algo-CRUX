package Assignment_1;

public class Double_sided_arrow {
  public static void main(String[] args) {
    int n = 7;
    int row = 1;
    int nst =1 ;
    
    int nsp1= n-1;
    int nsp2 = -1;
    int val1 = row;
    int val2 =1;
    while(row<=n){
       int csp1=1;
       while(csp1<=nsp1){
           System.out.print("--");
           csp1++;
       } 
       int cst1 =1;
       while(cst1<=nst){
           System.out.print(val1 + " ");
           val1--;
           cst1++;
       }
       int csp2 =1;
       while(csp2<=nsp2){
           System.out.print("--");
           csp2++;
       }

       if(row !=1 && row !=n){
           int cst2=1;
           while(cst2<=nst){
               System.out.print(val2+" ");
               val2++;
               cst2++;
           }
       }
       if(row<=n/2){
           nst++;
           nsp1-=2;
           nsp2+=2;
           val1 = row+1;
           val2 =1;
       }else{
           nst--;
           nsp1+=2;
           nsp2-=2;
           val1 = n-row;
           val2 =1;
       }
       System.out.println();
        row++;
    }
  }


}
