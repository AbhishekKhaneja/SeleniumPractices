package list;

import java.util.HashMap;

public class mapAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , String> map= new HashMap<String , String>();
		HashMap<String , String> map1= new HashMap<String , String>();
		 map.put("a", "HI");
		 map.put("b", "there");
		 
		 for(String temp : map.keySet())
		 {
		
			// System.out.println(temp);
			 if(map.containsKey("a") && map.containsKey("b"))
					 {
				String A=(map.get("a"));
				String B=(map.get("b"));
				System.out.println(A+" "+B);
					 }
			 if(map.containsKey("a"))
			 {
		String A=(map.get("a"));
		
		System.out.println(A);
			 }
			 if(map.containsKey("b"))
			 {
		
		String B=(map.get("b"));
		System.out.println(B);
			 }
			 
		 }
		 
	}
}


