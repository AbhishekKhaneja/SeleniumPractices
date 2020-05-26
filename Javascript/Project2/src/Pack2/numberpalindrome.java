package Pack2;

public class numberpalindrome {
	int flag=0;
	public int palindrome(Integer[] Arr)
	{
		int j=0;
		Integer arr2[]=new Integer[Arr.length];
		for( int i =(Arr.length-1);i>=0;i--)
		{
			
		arr2[j]=Arr[i];	
		//System.out.println(arr2[j]);
		j++;
		}
		j=0;
		int count=0;
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(arr2[j]);
			if(arr2[j]==Arr[i])
			{
				count++;
				
			}
			j++;
			if (count==Arr.length)
			{
				flag++;
			}
		}
		
		
		 return flag;
	}

}
