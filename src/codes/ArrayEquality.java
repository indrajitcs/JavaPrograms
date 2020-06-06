package codes;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
	int a[]= {2,6,8,5};
	int b[]= {2,4,6,8,5};
	boolean flag=false;
	flag=Arrays.equals(a, b);
	if(flag)
	{
		System.out.println("Arrays equal");
	}
	else
	{
		System.out.println("Arrays unequal");
	}
	
	}

	

}
