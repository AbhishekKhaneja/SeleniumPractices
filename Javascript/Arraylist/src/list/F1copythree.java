package list;

import java.util.ArrayList;

public class F1copythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list = new ArrayList<String>();
     ArrayList<String> list1 = new ArrayList<String>();
     list.add("abhishek");
     list.add("khaneja");
     
     for(int i=0;i<list.size();i++){
    	  String j = list.get(i);
    	 list1.add(j.concat(j).concat(j));
    	 
    	 
    	 
     }
     System.out.println(list1); 
     
     
     
	}

}
