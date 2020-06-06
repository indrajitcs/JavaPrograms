package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sort_List {

	public static void main(String[] args) {
		
		
		List<String> original = new ArrayList<String>();
		original.add("Ravi");
		original.add("Indrajit");
		original.add("Dhiren");
		original.add("Zakir");
		original.add("Sarun");
		original.add("Abhishek");
		
		List<String> temp = new ArrayList<String>();
		temp.addAll(original);
		
		//Sorting in Ascending Order
		Collections.sort(temp);
		System.out.println("Collections in Ascending Order.....");
		Iterator<String> itr =temp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		List<String> temp1 = new ArrayList<String>();
		temp1.addAll(original);
		
		
		//Sorting in Descending  Order
		
		
				Collections.sort(temp1,Collections.reverseOrder());
				System.out.println("Collections in Descending Order.....");
				Iterator<String> itr1 =temp1.iterator();
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
		
		
		
		
		

	}

}
