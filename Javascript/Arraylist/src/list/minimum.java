package list;

import java.util.ArrayList;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(14);
		list.add(13);
		list.add(3);
		list.add(1);
		
		int min=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(min>list.get(i))
			{
				min=list.get(i);
			}
		}
System.out.println(min);
	}

}
