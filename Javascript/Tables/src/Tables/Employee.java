package Tables;

public class Employee {
	String First;
	String Last;
	int Sal;
	char Grade;
	static int count;
	
	public Employee(String F,String L,int S,char G)
	{
		First=F;
		Last=L;
		Sal=S;
		Grade=G;
		
	}
	public void display()
	{
		
		count++;
		System.out.println(First);
		System.out.println(Last);
		System.out.println(Sal);
		System.out.println(Grade);
		System.out.println(count);
	}
	
	

}
