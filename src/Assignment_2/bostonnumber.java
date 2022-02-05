package Assignment_2;

import java.util.Scanner;

public class bostonnumber {

	public static void main(String[] args) {
		System.out.println(check(378));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int nw = 0;
		int i = 2;
		int fact = 0;
		int ans = 0;
		while (true) {

			if (n % i == 0) {
				// System.out.println(i + "*");
				if (i > 10) {
					int j = i;
					while (j > 0) {
						fact = j % 10;
						ans = ans + fact;
						j /= 10;
						// System.out.println(ans + "&");
					}

				} else {
					ans = ans + i;
				}
				// System.out.println(ans);
				n /= i;
			}

			else {
				i++;
			}

			if (n == 1) {
				break;
			}

		}

		while (m > 0) {
			int rem = m % 10;
			nw = nw + rem;
			m /= 10;

		}
		// System.out.println(ans);
		// System.out.println(nw);
		if (ans == nw) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

	public static int check(int n) {
		int sum1 = 0;
		int n2 = n;
		int sum2 = 0;
		
		int i = 2;
		

		while (i <= n2) {
			while (n2 % i == 0) {
				sum2 = sum2 + i;
				n2 /= i;
			}
			i++;
		}
		while (n != 0) {
			int rem = n % 10;
			sum1 = sum1 + rem;
			n /= 10;
		}

		if (sum1 == sum2)
			return 1;

		else
			return 0;
	}
}
