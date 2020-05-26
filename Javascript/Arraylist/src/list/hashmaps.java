package list;

import java.util.HashMap;

public class hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer , String> map= new HashMap<Integer , String>();
		map.put(1, "INDIA");
		map.put(2,"IS");
		map.put(3,"THE");
		map.put(4,"BEST");
	boolean a =	map.containsKey(5);
	System.out.println(a);
		map.remove(3);
		System.out.println(map.get(3));
		boolean A=map.isEmpty();
		System.out.println("A="+A);
		
		
		for(Integer temp : map.keySet())
		{
			System.out.println(temp);
			if(temp == 5)
			{
				System.out.println("hai");
			}
			else
			{
				System.out.println("nahi hai");
			}
		}
		for(String temp : map.values())
		{
			System.out.println(temp);
		}
		
	}
	


}
