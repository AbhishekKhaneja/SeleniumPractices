package list;

import java.util.ArrayList;

public class list {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("IND");
		list.add("NZ");
		list.add("ENG");
		
		list.add(3, "AUS");
		list.remove(3);
		
		String F= list.get(2);
		 System.out.println(F);
		

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		

}
}
