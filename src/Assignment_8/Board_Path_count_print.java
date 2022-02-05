package Assignment_8;

public class Board_Path_count_print {
    public static void main(String[] args) {
        int face = 3; // here face is the faces of dice
        ways(0,3,face,"");
        System.out.println();
        path(0,3,face,"");
        System.out.println(count);
    }
   public static void ways(int curr,int n,int face ,String ans){
       if(curr==n){
           System.out.print(ans+" ");
           return;
       }
       if(curr>n){ //if(curr<=n){for loop} // also work
           return;
       }
       for(int i = 1 ; i<=face ; i++){
           ways(curr+i , n,face ,ans+i);
       }
       
   }

   
   public static int count = 0;
   public static void path(int curr,int n ,int face ,String ans){
       if(curr==n){
           count++;
           return;
       }
       if(curr>n){
           return;
       }
       for(int move = 1; move<=face;move++){
           path(curr+move,n,face,ans+move);
       }
   }

}
    

