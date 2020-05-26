package inherit;

public class bike extends vehicle {
	
	public bike(int x,int y)
	{
		super(4);
		System.out.println("In bike constructor"+x +y);
		
	}
	public void engine(int x ,int y)
	{
		System.out.println("in child 60hp");
	}
	
	public void Digitalmeter()
	{
		System.out.println("Digital meter");
	}
	

}
