package Assignment_8;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        generate(2,0,0,"");
    }
    public static void generate(int n ,int open,int close, String ans){
        if(open == n && close ==n){
            System.out.println(ans);
            return ;
        }
        if(close < open){
            generate(n,open,close+1,ans+")");
        }
        
        if(open <n){
             generate(n, open+1, close, ans+"(");
        }
    }
    
}
