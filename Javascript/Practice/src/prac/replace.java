package prac;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a ="abc-def";
//		String b =a.replace('-',',');
//		System.out.println(b);
		
		//int[] arr = new int[10];
		int size = 10,Total=0;
		int [] arr={2,3,4,5,6,7,8,1,10};
		Total = size *(size+1)/2;
		for(int i =0;i<arr.length;i++)
		{
		Total = Total-arr[i];
		}
		System.out.println(Total);
		

	}

}
