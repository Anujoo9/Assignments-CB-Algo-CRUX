package Assignment_8;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        SubSequencE(str,"");
    }
    public static void SubSequencE(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
            // return 1;
            
        }
        char ch = ques.charAt(0);//a
        SubSequencE(ques.substring(1), ans);//no
        SubSequencE(ques.substring(1), ans+ch);//yes
    //    int yes = SubSequencE(ques.substring(1), ans);//no
    //    int no = SubSequencE(ques.substring(1), ans+ch);//yes
    //    return yes + no;
    }
    
}
