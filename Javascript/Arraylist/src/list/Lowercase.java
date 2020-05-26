package list;

import java.util.ArrayList;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> List = new ArrayList<String>();
		List.add("Hello");
		List.add("Hi");
		List.add("ABC");
		
	
	
	for(String i : List)
	{
	String J=i.toLowerCase();
	System.out.println(J);
	}
	

}
}
