public class InnerClassExample {
	
	int r;
	public void helloMethod()
	{
		System.out.println("Hello Outer Class");
		InnerClass innc = new InnerClass();
		innc.InnerMethod();
	}
	
	private class InnerClass
	{
		int y=10;
		public void InnerMethod()
		{
			System.out.println("Hello Inner Class");
			r=y;
			System.out.println(r);
		}
				
	}
	

}
