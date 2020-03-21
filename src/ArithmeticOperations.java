import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperations {
	
	public float addMethod (int x, int y)
	{
		float z=0;
		z=x+y;
		return z;
		
	}
	
	public float subMethod (int x, int y)
	{
		float z=0;
		z=x-y;
		return z;
		
	}
	
	public float multMethod (int x, int y)
	{
		float z=0;
		z=x*y;
		return z;
		
	}
	
	public float divMethod (int x, int y)
	{
		float z=0;
		z=x/y;
		return z;
		
	}
	
	public float modMethod (int x, int y)
	{
		float z=0;
		z=x%y;
		return z;
		
	}
	
	public void checkNumber(double x)
	{
		if (x > 0)
			System.out.println(x+ " is a positive number");
		else if (x < 0)
			System.out.println(x+ " is a negative number");
		else
			System.out.println(x+ " is a zero");
	}
	
	public void calculateMarks() throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] marks = new int[5];
		int totalMarks = 0;
		for (int i =0; i<marks.length; i++)
		{
			System.out.println("Enter marks for subject no "+(i+1)+": ");
			marks[i]=Integer.parseInt(br.readLine());
			totalMarks+=marks[i];
		}
		
		System.out.println("Total Marks obtained = "+totalMarks);
		System.out.println("Percentage = "+((double)(totalMarks/marks.length)));
	}
	
}
