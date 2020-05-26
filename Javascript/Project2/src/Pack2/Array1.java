package Pack2;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer []Arr={10,11,12,44,41,10,12,1004};
		int count=0;
		int a=0,c=0;
		int max= Arr[0];
	// To find the Maximum from the Array
		for(int i=0;i<Arr.length;i++)
		{
			if (max<Arr[i])
			{
				max=Arr[i];
			}
		}
		System.out.println("Maximum value is "+max);
	}
}

			
		/*	if(Arr[i]==12)
			{
				count++;
				System.out.println("Index of 12 ="+i);
			}
			if(Arr[i]==44)
			{
				a++;
				System.out.println("Index of 44 ="+i);
			}
			if(Arr[i]==2000)
			{
				c++;
				System.out.println("Index of 2000 ="+i);
			}
			
		}
		System.out.println("No of times 12 Occured ="+count);
		System.out.println("No of times 44 Occured ="+a);
		System.out.println("No of times 2000 Occured ="+c);
		
	

	}

}*/
