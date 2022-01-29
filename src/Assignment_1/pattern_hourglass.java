package Assignment_1;

public class pattern_hourglass {
    public static void main(String[] args) {
        hourglass(5);
    }
    static void hourglass(int n){
        int star = 2*n+1;
        int space =0;
        int value =n;
        for(int i =0;i<2*n+1;i++){
            int ivalue=value;
            //System.out.println(space+" " +star);
            for(int j =0;j<=space;j++){System.out.print("  ");}
            for(int j =0;j<star;j++){
                if(j<star/2){ System.out.print(ivalue+ " ");
                    ivalue--;} 
                else { 
                    System.out.print(ivalue+ " ");
                    ivalue++; }}
            if(i<n){
            star-=2;
            space++;value--;}
            else{star+=2;space--;value++;}
            System.out.println();
        }
        }
}
