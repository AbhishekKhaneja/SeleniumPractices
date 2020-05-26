package list;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class noteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List = new ArrayList<Integer>();
		List<Integer> List1= new CopyOnWriteArrayList<Integer>();
		List1.add(10);
		List1.add(13);
		List1.add(14);
		List1.add(15);
		List1.add(10);
		
	
	for(Integer S : List1)
	{
	System.out.println(S);	
	if( S>=13 )//&& S<=19)   
	{
		List1.remove(S);
	//  List.remove(S);index
	}
	}
	System.out.println(List1);
		
		
		
//		for(int i=0;i<List.size();i++)
//		{
//			
//		int a=	List.get(i);
//		System.out.println(a);
//			if(List.get(i)>=13 && List.get(i)<=19)
//			{
//				List.remove(i);
//			}
//		}
//		System.out.println(List);
//		
	
	
	
	}
}
