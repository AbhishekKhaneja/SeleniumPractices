
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 19;
		int count=0;
	for(int i =2;i<n-1;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count>0)
	{
		System.out.println("Not prime");
	}
	else
	{
		System.out.println("prime");
	}

	}

}
