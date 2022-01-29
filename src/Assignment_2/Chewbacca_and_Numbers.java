package Assignment_2;



// invert the digit if the inverted is less than original digit
public class Chewbacca_and_Numbers {
    public static void main(String[] args) {
       long val = 99;
       long val1 = 81;
       System.out.println(chew(val));
       System.out.print(chew(val1));
    }
    
    public static long chew(long val){
        long ans = 0 ; 
        long mul = 1;
        while(val>0){
            long rem = val%10;
            long re = 9-rem;
            if(val/10==0 && re ==0){
                
            }
           else if (re<rem  ){
                rem = re;
            }
            ans+=rem*mul;
            mul*=10;
            val/=10;
        }return ans;
    }
    
}
