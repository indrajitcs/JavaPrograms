package codes;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {

		String s = " Sachin is awarded the      Bharat Ratna  ";
        String temp=s.trim();
        System.out.println(temp);
        System.out.println(temp.replaceAll("\\s+", " "));
        System.out.println(temp.replaceAll("\\s{2,}", " "));
        
	}

}