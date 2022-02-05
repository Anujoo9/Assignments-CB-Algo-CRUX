package Assignment_8;

public class Recursion_keypad_codes {
    public static String[] arr = {"","abc", "def", "ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        nokia("12","");
        System.out.println();
        System.out.print(count);
    }
    public static int count = 0;
    public static void nokia(String key, String ans){
        if(key.length()==0){
            System.out.print(ans+" ");
            count++;
            return ;
        }
        char ch = key.charAt(0);
        String KeyString =  arr[ch-48];
        for(int i = 0 ; i<KeyString.length();i++){
            nokia(key.substring(1),ans+KeyString.charAt(i));
        }
    }
    
}
