package Assignment_4;
///working
public class remove_consecutive_duplicates {
    public static void main(String[] args) {
        String str = "aabccba";
        System.out.println(rem(str));
    }
    public static String rem(String str){
        String ans = "";
        for(int i = 0 ; i<str.length();i++){
            char c = str.charAt(i);
            if(count(str,c,i)==1){
                ans+=c;
            }
        }

        return ans;

    }
    public static int count (String str ,char c,int j){
        int sum = 0;
        for(int i = j ; i< str.length();i++){
            if(str.charAt(i)==c){
                sum++;
            }else {
                return sum;
            }
        }
        return sum;
    }
}
