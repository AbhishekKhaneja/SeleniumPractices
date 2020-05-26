package Pack2;

public class printreversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] Arr1={1,2,3,4,5,6,7,8,9};
		 Integer[] revint = new Integer[Arr1.length];
		 int j=0;
		for(int i = (Arr1.length-1);i>=0;i--)
		{
			revint[j]=Arr1[i];
			System.out.print(revint[j]+",");
					
		}
		

	}

}
