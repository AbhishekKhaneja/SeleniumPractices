package list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class noZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> list1 = new ArrayList<String>();
		List<String> list1 = new CopyOnWriteArrayList<String>();
		//List<String> list1 = new List<String>();
		list1.add("Rzl");
		list1.add("Azi");
		list1.add("hzyu");
		list1.add("T");
		
		for(String s : list1)
		{
	
         if(s.contains("z"))			
        { 
			 list1.remove(s);
			

	    }

         }
		System.out.println(list1);
	}
}
