package Assignment_8;

public class pow_recursion {
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }    
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        else{
            return a*pow(a,b-1);
        }
    }
}
