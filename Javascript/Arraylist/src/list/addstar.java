package list;

import java.util.ArrayList;

public class addstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test obj = new test();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("Hi");
		list.add("There");
		list.add("Whatsup");
		list.add("delhi");
		list.add("*");
		
		for(String i : list)
		{
			list1.add(i+"*");
			
		}
		System.out.println(list1);
		
	}

}
