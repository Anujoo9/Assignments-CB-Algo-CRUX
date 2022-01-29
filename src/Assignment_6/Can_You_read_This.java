package Assignment_6;

public class Can_You_read_This {
    public static void main(String[] args) {
     
        StringBuilder str = new StringBuilder("IAmACompetitiveProgrammer");
        System.out.println(read(str));
    }
    public static StringBuilder read(StringBuilder str){
        StringBuilder ans = new StringBuilder("");
        for(int i = 0 ;i<str.length();i++){
            char c = str.charAt(i) ;
            if(Character.isUpperCase(c)){
                ans.append("\n");
            }
            ans.append(c);
        }
        return ans;
    }
}
