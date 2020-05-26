package prac;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String A ="Hello";
		
		
		if(a.equals(A))
		{
			System.out.println("true");
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(i%2==0)
				{
			  System.out.print(i);
			  break;
			    }
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();
			
		}

	}

}

 