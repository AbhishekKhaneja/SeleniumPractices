package prac;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String A = "Java is a programming language and i love java";
		String B = "Java";
		int Count = 0;
		

		String[] Arr = A.split(" ");
		
	for(int i =0;i<Arr.length;i++)
	{
		if(Arr[i].equalsIgnoreCase(B))
		{
			Count++;
		}
	}
	System.out.println("Number of times java = "+Count);
	}

}
