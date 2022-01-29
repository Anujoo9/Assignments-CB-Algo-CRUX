package Assignment_6;

public class String_toggle_case {
    public static void main(String[] args) {
        String str = "abC";
        String str1= toggle(str);
        System.out.println(str1);
    }

    public static String toggle(String str){
        String ans = "";
        for(int i = 0 ;i < str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else{
                c = Character.toUpperCase(c);
            }
            ans+=c;
        }
        return ans;
    }
    
}
