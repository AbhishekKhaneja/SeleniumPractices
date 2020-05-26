package Pack2;

public class only14 {
	

	public boolean only(Integer[] arr)
	{
		boolean flag=false;
		 for(int i=0;i<arr.length;i++)
		 {
			 if (arr[i]!=1 && arr[i]!=4)
			 {
				 flag=false;
			 }
			 else
			 {
				 flag=true;
			 }
		 }
		 return  flag;
	 }

}

