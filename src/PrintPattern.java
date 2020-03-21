
public class PrintPattern {
	
	public void printTrianglePattern()
	{
		for (int i=1; i<6; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
