package Assignment_1;

public class Inverted_hour_Glass {
    public static void main(String[] args) {
        int n = 7;
        int k = n;
        int x1=n;
        for (int row = 0; row < 2 * n + 1; row++) {
            System.out.print(n + " ");
            if (row > 0 && row < 2 * n + 1) {
                if (row < n) {
                    for (int i = 0; i < row; i++) {
                        System.out.print(n - i - 1 + " ");
                    }
                }
                if (row >= n) {
                    for (int j = 0; j < x1; j++) {
                        System.out.print(n - j - 1 + " ");
                    }
                    x1--;
                }
            }
            for (int j = 2 * k - 1; j > 0; j--) {
                System.out.print("--");
            }
            if (row < (2 * n + 1) / 2) {// for space
                k--;
            } else { // for space
                k++;
            }

            if (row > 0 && row < 2 * n + 1) {
                if (row < n) {
                    for (int j = 1; j <= row; j++) {
                        System.out.print(n-row+j-1 + " ");
                    }
                }
                if (row >= n) {
                    for (int j = row-n; j < n; j++) {
                        if(j!=0){

                            System.out.print(j + " ");
                        }
                    }
                    
                }
            }

            System.out.print(n + " ");
            System.out.println();
        }
    }
}
