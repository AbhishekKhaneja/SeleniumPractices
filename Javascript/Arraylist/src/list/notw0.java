package list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class notw0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(6);
		
		for(Integer i : list)
		{
			int Q=i*2; 
		if(Q%10==2)
		{
			list.remove(i);
		}
		else
		{
		
		
			
		}
		
		
		}
		System.out.println(list); 
		
		

	}

}
