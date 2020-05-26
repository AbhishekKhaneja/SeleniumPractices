package Pack2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr ={1,2,4,5,2,7};
//		Integer[] intarr = new Integer[3];
//		Integer []intarr2= new Integer[3];
//		Integer intarr3[]= new Integer[3];
//		
//		char[] arr1 = {'A','B','C','D','F','E'};
//		String[] arr2 = {"Abhishek ","is ","good"};
//		intarr[0]= 1;
//		intarr[1]=3;
//		intarr[2]=1;
		
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==12)
				{
					System.out.println(arr[i] +" and "+ arr[j]);
				}
			}
		}
		
		

	}

}
