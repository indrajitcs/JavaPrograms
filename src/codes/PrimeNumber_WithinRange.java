package codes;

import java.util.Scanner;

public class PrimeNumber_WithinRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range..");
		int n=sc.nextInt();
		int i,j;
		for( i=1;i<=n;i++)
		{
			int f=0;
			for( j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					f++;
				}
			}
			if(f==2)
			{
				System.out.print(" "+i+" ");
			}
		}
			
			sc.close();
		}
	

}
