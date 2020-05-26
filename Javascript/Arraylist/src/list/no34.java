package list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class no34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> List = new ArrayList<String>();
		List<String> List = new CopyOnWriteArrayList<String>();

		List.add("Abhi");
		List.add("shek");
		List.add("hello");
		List.add("Rav");
		
		
		for(String s : List)
		{
		if(s.length()==3 )//|| s.length()==4)
		{
			List.remove(s);
		}
		if(s.length()==4)
		{
			List.remove(s);
		}
		
		}
		System.out.println(List);
	}

}
