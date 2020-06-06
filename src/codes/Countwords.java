/** WAP to count the words in a Sentence
 * Logic is we need to calculate the blank spaces
* @author Indrajit Bhattacharjee
 * @date Jan 23 ,2019
 */

package codes;
import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		String ch[]=s.split("\\s+");
		System.out.println("The Words are =  "+ ch.length);
		

	}

}
