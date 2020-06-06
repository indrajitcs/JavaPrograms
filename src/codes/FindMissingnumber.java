package codes;

public class FindMissingnumber
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,5};
		
		//First find the maximum number.....
		int max=a[0];
		int index=0;
		for(int i=1;i< a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
		}
		
		System.out.println("The Maximum number is  "+ max+" present in the index position "+index);
		//Now we got the Maximum number...........
		//First calculate the sum as per Formula (n*(n+1))/2
		int n=a[index];
		int sum =(n*(n+1))/2;
		int sum_ofvalues=0;
		for(int i=0;i< a.length;i++)
		{
			sum_ofvalues=sum_ofvalues+a[i];
		
		}
		
		int missingNumber =sum-sum_ofvalues;
		System.out.println("-------------The Missing number is-----------------------------");
		System.out.println(missingNumber);
		
		
		
	}
	
	
	
	
	
	

}
