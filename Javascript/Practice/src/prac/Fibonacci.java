package prac;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 0,c;
		int b= 1;
		
	for(int i=0;i<=10;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;

	}

}
}
