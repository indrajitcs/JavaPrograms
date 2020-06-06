/**WAP to swap two numbers using a third variable
 * @author Indrajit Bhattacharjee
 * @date Jan 26,2019
 */

package codes;

import java.util.Scanner;

public class swap_Numbers_ThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number....");
		int x = sc.nextInt();	
		System.out.println("Enter the Second number....");
		int y = sc.nextInt();
		System.out.println("Numbers before Swapping...");
		System.out.println("First number ="+x+ " "+"Second number ="+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("Numbers after Swapping...");
		System.out.println("First number ="+x+ " "+"Second number ="+y);
		
		

	}

}
