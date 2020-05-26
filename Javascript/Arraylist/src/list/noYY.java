package list;

import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class noYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> List = new CopyOnWriteArrayList<String>();
		ArrayList<String> List = new ArrayList<String>();
		List.add("a");
		List.add("ay");
		List.add("bc");
		List.add("o");
		
		for(int i=0;i<List.size();i++)
		{
		String s= List.get(i);
		
		String L=s+'y';
		//System.out.println(s);	
		if(L.substring(L.length()-2,L.length()).equals("yy"))
		{
			List.remove(s);
			//System.out.println("andar aaya");
		}
		else{
	             //  List.get(i)+'y';
		}
		}
System.out.println(List);		
		
		
		
		
//		for(String s: List)
//		{
//			String j=s.substring(s.length()-1,s.length());
//			
//	         if(j.equals("y"))
//			{
//			List.remove(s);
//			}
//			else
//			{
//				s=s.concat("y");
//				System.out.println(s);
//			}
//		}
//		System.out.println(List);
		

	}

}
