package Assignment_8;

public class Replace_All_Pi {
    public static void main(String[] args) {
        System.out.println(Pi("xabpixx3.15x"));
    }
    public static String Pi(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='p' && str.length()>=2 && str.charAt(1)=='i'){
            return "3.14" + Pi(str.substring(2, str.length()));
        }

        return str.charAt(0) + Pi(str.substring(1, str.length()));
    }
    
}
