package list;

import java.util.ArrayList;

public class moreY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		
		list.add("Abhishek");
		list.add("kjane");
		
	for(String F : list)
	{
		list1.add("Y"+F.concat("Y"));
	}
	System.out.println(list1);
		
	}

}
