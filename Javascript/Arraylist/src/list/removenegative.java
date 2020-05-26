package list;

import java.util.ArrayList;

public class removenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<Integer> List = new ArrayList<Integer>();
	ArrayList<Integer> List1 = new ArrayList<Integer>();
		
		List.add(1);
		List.add(-1);
		List.add(0);
		List.add(-10);
		
		for(Integer i : List)
		{
	//List.removeIf(i -> i < 0);
	if(i>=0)
	{
		
		List1.add(i);
	}
	
	
		}
		System.out.println(List1);

}
}
