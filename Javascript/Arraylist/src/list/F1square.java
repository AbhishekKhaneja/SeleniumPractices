package list;

import java.util.ArrayList;

public class F1square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> list = new ArrayList<Integer>();
  ArrayList<Integer> list1 = new ArrayList<Integer>();
  list.add(10);
  list.add(40);
  list.add(20);
  list.add(30);
		
  
  for (Integer i : list)
  {
	  list1.add(i*i);
	  System.out.println(list1);
  }
	}

}
