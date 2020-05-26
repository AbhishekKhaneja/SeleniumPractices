package arrays;

public class arraysTest {
	
	public  int[] reverse(int[] list)
	{
		int[] result = new int[list.length];
		
		for(int i =0;i<list.length;i++)
		{
			for(int j=0;j<result.length;j++)
			{
				result[j]=list[i];
				System.out.println(result[j]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 arraysTest obj = new arraysTest();
  int [] arr = new int[3];
  arr[0] = 4;
arr[1] = 5;
arr[2] = 6;
		int [] a =obj.reverse(arr);
		
		for(int k =0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}

}
