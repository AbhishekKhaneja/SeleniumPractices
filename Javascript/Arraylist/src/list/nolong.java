package list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class nolong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		List<String> list1 = new CopyOnWriteArrayList<String>();
		list1.add("Ral");
		list1.add("Abhi");
		list1.add("hyyuyu");
		list1.add("T");
		
		for(String s : list1)
		{
			
			
		if(s.length()>=4)
			{
			 list1.remove(s);
			}
		}
		System.out.println(list1);

	}

}
