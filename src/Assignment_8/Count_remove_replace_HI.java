package Assignment_8;

public class Count_remove_replace_HI {
   public static class hi{ 
    public static int count = 0;
   
    
    public  String Counthi(String str) {
        if (str.length() <= 1) {
            System.out.println(count);
            return "";
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i' && str.length() >= 2) {
            count++;
            return Counthi(str.substring(2, str.length()));
        }
        return Counthi(str.substring(1));
    }
    
    public  String Removehi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i' && str.length() >= 2) {
            return Removehi(str.substring(2, str.length()));
        }
        return str.charAt(0) + Removehi(str.substring(1, str.length()));
    }
    
    public  String Replacehi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i' && str.length() >= 2) {
            return Replacehi("bye" + Replacehi(str.substring(2, str.length())));
        }
        return str.charAt(0) + Replacehi(str.substring(1, str.length()));
    }
   }
    public static void main(String[] args) {
        hi obj = new hi();
       obj. Counthi("abchibhi");
        System.out.println(obj.Removehi("abchibi"));
        System.out.println(obj.Replacehi("abchibi"));
    }
}
