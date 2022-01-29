package Assignment_4;
///remove all duplicates
public class remove_duplicates {
    public static void main(String[] args) {
        String str = "ababaaaacsdsssebbb";
        String s = orig(str);
        System.out.println(s);
        System.out.println("hogya");
    }
    public static String orig(String str){
        String ans = new String();
        ans+=str.charAt(0);
        for(int i = 0 ; i<str.length();i++){
            char c = str.charAt(i);
            String ans1= c+"";
         
            if(ans.contains(ans1)==false){
                ans+=c;
            }
        }
        return ans;
    }
    
}
