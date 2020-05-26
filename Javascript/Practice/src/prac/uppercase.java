package prac;

public class uppercase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="abhishek is a bad boy";
		
	String[] A1 =A.split(" ");
	
	String A2 =A1[0].toUpperCase() +" "+ A1[1]+" "+ A1[2]+" " + A1[3]+" " + A1[4].toUpperCase();
		
	System.out.println(A2);
		

	}

}
