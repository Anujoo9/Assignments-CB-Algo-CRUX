package Assignment_8;

public class Recursion_Duplicate_character_formatting {
    public static void main(String[] args) {
        String str = "hellkllo";
        System.out.println( duplicate(str,""));
    }
    public static String duplicate(String str , String ans){
        if(str.length() == 0 ){
            return ans;
        }
        if(str.length()>1 && (str.charAt(0) == str.charAt(1))){
            return duplicate(str.substring(2), ans+str.charAt(0)+"*"+str.charAt(1));
        }
        return duplicate(str.substring(1) , ans+str.charAt(0));
    }
}
