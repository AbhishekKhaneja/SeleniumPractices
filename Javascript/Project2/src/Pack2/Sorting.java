package Pack2;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] sort={13,10,11,2,4,5,6,34,19};
		 //int sort1= sort[0];
		 int sort2;
		 
		
		 
		 for(int i=0;i<sort.length;i++)
		 {
			if(sort[i]>sort[i+1])
			{
				sort2=sort[i];
				sort[i]=sort[i+1];
				sort[i+1]=sort2;
				
				System.out.println();
			}
		 }
	}

}
