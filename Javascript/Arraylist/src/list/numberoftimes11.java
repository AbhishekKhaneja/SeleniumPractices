package list;

import java.util.ArrayList;

public class numberoftimes11 {
	int Q=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(13);
		list.add(3);
		list.add(1);
		
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		
		for(int i=list.size()-1;i>=0;i--)
		{

			list1.add(list.get(i));
				System.out.println(list1);
			}
			
			
		}
		

	}

