package Assignment_8;

public class Recursion_String_to_int {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(StI(str));
    }
    public static int  StI(String str){
        if(str.length()==1){
            return (str.charAt(0) - '0');
        }
        double y = StI(str.substring(1));
        double x = str.charAt(0) -'0';// to change asci to normal value

        x = x*(Math.pow(10, str.length()-1)) +y;
        return (int)x;
    }
    
}
