package Assignment_4;

public class String_odd_even {
    public static void main(String[] args) {
        String a = "abcg";

        odd_even(a);
    }



    public static void odd_even(String str){
        for(int i=0; i<str.length(); i++) {
			
            if(i%2==0){
               int asci = (int)str.charAt(i)+1;
               char asc=(char)asci;
			System.out.print(asc);
            }else{
                int asci = (int)str.charAt(i)-1;
                 char asc = (char)asci;
                System.out.print(asc);
            }
		}
    }
    
}
