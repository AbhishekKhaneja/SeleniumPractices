
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=3;i<100;i++)
		{
			for(int j=2;j<i;j++)
			{
				
				if((i%j==0))
				{
					count++;
				}
			}
			if(count == 0)
			{
				System.out.println(i);
			    	
			}
			count=0;
		}
	}
	
}

		
		
		
		
		
		
		
		
		
		
		
				

