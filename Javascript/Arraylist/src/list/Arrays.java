package list;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr ={1,2,4,5,6,7};
        Integer [] arr1={1,4,5,6,7};
		
		for(int i=0;i<arr.length;i++)
		{
		//System.out.println(arr[i]);
			int j;
		for (j=0;j<arr1.length;j++)
		{
			if(arr[i]==arr1[j])
				break;
			if(j==arr1.length-1)
			{
			//	System.out.println("Hello");
				System.out.println(arr[i]);
			}
		}
		
		}
		

	
	}

}
