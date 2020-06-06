package codes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String s = "ABBBCCCDEFHHMMMN";
		char ch[] = s.toCharArray();
		Set<Character> uniqueChars = new HashSet<Character>();
		System.out.println("Duplicate Characters are...");
		for (int i = 0; i < ch.length;i++) {
             if(uniqueChars.add(ch[i])==false)
             {
            	 System.out.print(ch[i]+" ,");
             }
		}
		System.out.println();
		System.out.println("Unique Characters are...");
		Iterator iter=uniqueChars.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next());
		}

	
	}

}
