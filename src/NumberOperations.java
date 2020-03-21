
public class NumberOperations {
	
	public int[] descendingOrderMethod(int arr1[])
	{
		int temp=0;
		for (int i=0; i<=arr1.length-1; i++)
		{
			for (int j=0; j<arr1.length-1; j++)
			{
				if (arr1[j] < arr1[j+1])
					{
					temp = arr1[j];	
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
					}
			}
		}
		for (int k=0 ; k<=arr1.length-1; k++)
		{
			System.out.println(arr1[k]);
		}
		return arr1;
	}
	
	public void fibonacciSeries(int arrSize)
	{
		/*
		int x[]=new int[arrSize];
		x[0]=0;
		x[1]=1;
		for (int i=2; i<x.length; i++)
		{
			x[i]=x[i-1]+x[i-2];
		}
		for (int j=0; j<x.length; j++)
			System.out.println(x[j]); */
		int counter = 0;
		int x1=0;
		int x2=1;
		//int x=x1+x2;
		System.out.println(x1);
		System.out.println(x2);
		//System.out.println(x);
		while (counter <= arrSize)
		{
			int x=x1+x2;
			System.out.println(x);
			x1=x2;
			x2=x;
			counter+=1;
		}
	}
	
	public int factorialMethod(int num)
	{
		int fact=1;
		while (num>0)
		{
			fact = fact*num;
			num = num-1;
		}
		return fact;
	}
	
	public int factorialRecursion(int num)
	{
		int fact=1;
		if (num>1)
		{
			fact = factorialRecursion(num-1)*num;
			num = num-1;
		}
		return fact;
	}
	
	public int biggestNumber(int ... x)
	{
		int arr[];
		arr = descendingOrderMethod(x);
		return arr[0];
	}
}
