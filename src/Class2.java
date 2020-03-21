
public class Class2 {
	int x;
	String y;
		
	public Class2(int x, String y)
	{
		this.x=x;
		this.y=y;
		this.displayVar();
	}
	
	public Class2(int x, int y) {
		
		this.swap(x, y);
		
	}
	
	public void displayVar()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public void swap(int a, int b)
	{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println();
	}
	
		
}
