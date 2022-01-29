package Assignment_1;
public class test{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        // Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        
        int rows = 5;

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
// package Assignment_1;

// public class Inverted_hour_Glass {
//     public static void main(String[] args) {
//         int n = 5;
//         int k = n;
//         int x1 = n;
//         int x2 = n;
//         int x3 = n;
//         for(int i = 0;i<2*n+1;i++){
//             System.out.print(n+" ");
//             if(i>0&&i<2*n){
//                 if(i<n){
//                 for(int j = 0;j<i;j++){
//                     System.out.print(n-j-1 +" ");
//                 }}
//                 else{
//                     for(int j =0;j<x1;j++){
//                         System.out.print(n-j-1 +" ");
//                 }x1--;
//             }
//         }
//             for(int j = 2*k-1 ; j>0;j--){
//                 System.out.print("--");
//             }
//             if(i<(2*n+1)/2){//for space
//                 k--;
//             }
//             else{ //for space
//                 k++;
//             }
//             if(i>0&&i<2*n){
//                 if(i<n){
//                     for(int j = 0;j<i;j++){
//                         System.out.print(n-1+" ");
//                     }}
               
//                 else{
//                     for(int j =x2;j>0;j--){
//                         System.out.print(n-1+j +" ");
//                 }x2--;
//             }
//         }
//             System.out.println(n+" ");
//         }
//     }   
// }

