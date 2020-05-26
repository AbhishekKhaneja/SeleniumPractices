package prac;

import java.util.HashMap;

public class occurence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String c ="aabby";
		
	char[] b =	c.toCharArray();
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
	for(int i=0;i<b.length;i++)
	{
	char x = b[i];
	
	if(hm.containsKey(x))
	{
		hm.put(x,hm.get(x)+1);
	}
	else
	{
		hm.put(x, 1);
	}
	
	}
	System.out.println(hm);
		
	}

}
