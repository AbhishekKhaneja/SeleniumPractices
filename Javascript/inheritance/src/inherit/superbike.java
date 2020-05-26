package inherit;

public class superbike extends bike{

	public superbike(int l,int m,int n)
	{
		super(1,0);
		System.out.println("In superbike constructor"+l);
	}
	public void engine(int y)
	{
		super.engine(1,0);
		System.out.println("in superchild 800hp");
	}
	
	public void NOS()
	{
		System.out.println("we can use NOS in superbike");
	}
	
}
