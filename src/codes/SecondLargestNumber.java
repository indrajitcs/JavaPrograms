package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber 
{

	public static void main(String[] args) 
	{
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(12);
		numbers.add(52);
		numbers.add(52);
		numbers.add(92);
		numbers.add(342);
		numbers.add(26);
		Collections.sort(numbers);
		System.out.println(numbers.get(numbers.size()-2));

	}

}
