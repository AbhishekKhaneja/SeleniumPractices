package list;

import java.util.ArrayList;

public class math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer> List = new ArrayList<Integer>();
   List.add(1);
   List.add(3);
   List.add(2);
   List.add(4);
   
   ArrayList<Integer> List1 = new ArrayList<Integer>();
    
   
   for(Integer i : List)
   {
//	   int Q=List.get(i);
	 
	   List1.add((i+1)*10);
	   
   
	 
	}
   System.out.println(List1);

}
}