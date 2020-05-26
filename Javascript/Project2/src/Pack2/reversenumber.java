package Pack2;

public class reversenumber {

	public static void main(String[] args) {
		
		int number = 123456,x,y,a=0;
		while(number>0)
		{
		
		x=number%10;
		a=a*10+x;
		
		
		y=number/10;
		number=y;
		}
		System.out.println(a);
	}

}
