package codes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class find_DivisorsofNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number ...");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<Integer> divisors = new HashSet<Integer>();

		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				divisors.add(i);
			}
		}
		Iterator<Integer> iter = divisors.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		sc.close();

	}

}
