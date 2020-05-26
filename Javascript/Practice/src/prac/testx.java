package prac;

public class testx extends testy {

	
	public void a(int x)
	{
		System.out.println("HAHAHA");
		
	}
	public void a(float x)
	{
		System.out.println("ABC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		testx c = new testx();
		c.a(10);
		
		testy c1 = new testx();
		c1.a(10);
		
		
	}

}
