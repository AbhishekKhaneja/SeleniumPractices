package Staticvariables;

public class StaticvariablesTest {
	
	public static int minfunctions(int n1,int n2)
	{
		
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		
		return min;
	}
	public static void main(String[] args) {
		int a =11;
		int b =6;
		int c = minfunctions(a, b);
		System.out.println("minimum value="+ c);
		
		
		
		
		
		
		
//	public double salary;// scope is limited to this class only
//	
	
	
//	public void method()
//	{
//	    int a=0 ;
//		System.out.println(a+7);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StaticvariablesTest obj = new StaticvariablesTest();
//		obj.salary =1000;
//		System.out.println(obj.salary);
//		obj.method();
//		
		

	}

}
