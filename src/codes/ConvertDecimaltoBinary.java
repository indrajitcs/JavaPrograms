package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertDecimaltoBinary {

	public static void main(String[] args) {

int n=345;
int r;
List<Integer> binaryData =new ArrayList<Integer>();
while(n>0)
{
	r=n%2;
	binaryData.add(r);
	n=n/2;
	
}

Collections.reverse(binaryData);

System.out.println("After Reverse Order, ArrayList Contains : " + binaryData);

	}

}
