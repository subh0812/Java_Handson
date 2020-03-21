
public class Student extends Teacher {

	private String name;
	private int id;
	private String address;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	public String getAddress()
	{
		return address;
	}
}
