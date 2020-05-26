package list;

import java.util.ArrayList;

public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(13);
		List.add(1);
		List.add(10);
		List.add(19);
		
		
		for(int i=0;i<List.size();i++)
		{
			if(List.get(i)%10==9)
			{
				List.remove(i);
			}
		}

		System.out.println(List);
	}

}
