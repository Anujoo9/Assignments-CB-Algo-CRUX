package Assignment_1;

public class patter_triangle {
    public static void main(String[] args) {
        int n =4;
        int space=n;
        int star=1;
        int value =1;
        for(int i =1;i<=n;i++){
            int cvalue = value;
            for(int j =1;j<=space-1 ;j++){System.out.print("  ");}
            for(int j =1;j<=star;j++){System.out.print(cvalue + " ");
                if (j<=star/2){cvalue++;}
                else {cvalue--;}
            }
           
                star +=2;
                space--;
                value++;
                System.out.println();}
               
        
    }
    
}
