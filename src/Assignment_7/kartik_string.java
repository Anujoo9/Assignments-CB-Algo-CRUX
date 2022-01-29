package Assignment_7;

public class kartik_string {
    public static void main(String[] args) {
        String str ="abbaaabaaa";
        int k = 2;
        int a = stringlen(str,k,'a');
        int b = stringlen(str,k,'b');
        System.out.println(Math.max(a, b));

    }
    public static int stringlen(String str, int k , char c){
        int ans = 0 ;
        int ei = 0;
        int si =0;
        int flip = 0;
        while(ei<str.length()){
            char x = str.charAt(ei);
            if(x==c){
                flip++;
            }
            while(flip>k && ei>=si){
                if(str.charAt(si)==c ){
                    flip--;
                } si++;
            }//abbaaabaaa
            ans=Math.max(ans,(ei-si+1));
            ei++;
        }
        return ans;
    }
    
}
