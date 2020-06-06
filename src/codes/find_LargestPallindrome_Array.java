package codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class find_LargestPallindrome_Array {

	public static void main(String[] args) {
		
		int a[] = {22,333,859,4444,8888888,2574,985,1111189,7,9 };
		int l=a.length;
		List<Integer> pallindromes= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(isPallindrome(a[i]))
			{
				pallindromes.add(a[i]);
			}
		}
		
		System.out.println("Hii");
		
		Iterator<Integer> itr=pallindromes.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}



	}
	
	
	
	
	public static boolean isPallindrome(int n)
	{
		int  r, x;
		int rev = 0;
		x=n;
		while (x > 0) {
			r = x%10;
			rev = (rev * 10) + r;
			n = n/10;
		}
		
		if (rev == n) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void size(int n)
	{
		int  r, x;
		int rev = 0;
		x=n;
		while (x > 0) {
			r = x%10;
			rev++;
			n = n/10;
		}
	}

}
