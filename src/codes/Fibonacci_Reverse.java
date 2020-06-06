
/**Input : n = 5
Output : 3 2 1 1 0

Input : n = 8
Output : 13 8 5 3 2 1 1 0
*/

package codes;

import java.util.Scanner;

public class Fibonacci_Reverse {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the terms..........");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;

		for (int i = 2; i < n; i++) {

			// storing sum in the
			// preceding location
			a[i] = a[i - 2] + a[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {

			// printing array in
			// reverse order
			System.out.print(a[i] + " ");
		}
		sc.close();
		
	}
}
	

