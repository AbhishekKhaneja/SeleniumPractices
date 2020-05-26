package string;

import java.util.ArrayList;

public class Stringclassess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="INDIA";
		
	char[] arr=	x.toCharArray();
	
	System.out.println(arr[0]);
String S=x.substring(x.length()-2,x.length());
	System.out.println(S);	
		
		String y= new String("INDa");
		String print=x.substring(0,y.length());
		System.out.println(print);
		char firstx=x.charAt(0); 
		System.out.println(firstx);
		int len=x.length();
		System.out.println(len);
		boolean res=x.equals(y);
		System.out.println(res);
		int a=x.indexOf("N");
		System.out.println(a);
		String abc="test.xls";
      String[] b=abc.split("\\.");
      System.out.println(b[0]);
      System.out.println(b[1]);
      
      System.out.println("\"TEST\"");//to Print "TEST" 
      System.out.println("\"TEST\"");
      
      String temp = String.valueOf(1234567);
      
      System.out.println("Temp value ="+temp);
     String[] hey= temp.split("4");
     
     
     System.out.println(hey[0]);
     System.out.println(hey[1]);
      Boolean M = x.equalsIgnoreCase(y);
     System.out.println(M);
      
				
	}

}
