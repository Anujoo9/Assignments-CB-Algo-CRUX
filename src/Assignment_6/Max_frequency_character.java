package Assignment_6;

public class Max_frequency_character {
    public static void main(String[] args) {
        String str = "aaabacb";
       System.out.println( Max(str));
    }
    public static char Max(String str){
        int sum = 0;
        char ans ='a'; // char ans = '\0';//an empty char
        for(int i = 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            int j = count(str,ch);
            if(j>sum){
                sum = j;
                ans = ch;
            }
            
        }
        return ans;
        
    }
    public static int count (String str,char ch){
        int ans = 0;
        for (int i = 0 ;i<str.length();i++){
            if(str.charAt(i)==ch){
                ans++;
            }
        }
        return ans;
    }
    
}
