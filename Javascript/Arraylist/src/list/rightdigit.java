package list;

import java.util.ArrayList;

public class rightdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(145);
		list.add(67);
		list.add(10);
		list.add(13);
		list.add(3);
		list.add(1);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
    for(int i=0;i<list.size();i++)
    {
//    	int j=list%10;
//    	System.out.println(j);
//    	list1.add(j);
    	System.out.println(list.get(i)%10);
    }
	}

}
