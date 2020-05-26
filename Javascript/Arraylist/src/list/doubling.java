package list;

import java.util.ArrayList;

public class doubling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(12);
		list.add(113);
		list.add(15);
		list.add(16);
		list.add(1);
	
	
		
//advance forloop
	for(Integer i : list)
	{
		list1.add(i*2);
		
		System.out.println(list1);
	}
	}
	
}