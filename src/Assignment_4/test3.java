package Assignment_4;
// char to int --ASCII
public class test3 {
    public static void main(String[] args) {
        char ch1 = 'a';  
        char ch2 = 'b';  

        int ascii1 = (int) ch1 +1;  
        int ascii2 = (int) ch2;  
            System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
            System.out.println("The ASCII value of " + ch1 + " is: " + ascii2);  
            char ch = (char) ascii2;  
            System.err.println(ch);
    }
    
}
