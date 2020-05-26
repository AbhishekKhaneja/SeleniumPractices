package framework;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

public class execution2 {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		excelcomm2 obj = new excelcomm2();
		HashMap < Integer,ArrayList<String> > collectmap=obj.readexcel("Sheet1");
		for(int i=0;i<collectmap.size();i++)
		{
			ArrayList<String> list1 = collectmap.get(i);
			System.out.println(list1);
		KeywordLibrary2.controller(list1.get(0), list1.get(1), list1.get(2), list1.get(3));
		}
//	  for(int i =0 ;i<list1.size();i++)
//	  {
//		 String value= list1.get(i);
//		  KeywordLibrary2.OOpenBrowser(value, "http://newtours.demoaut.com/","skip");
//	  }
		
		

	}

}
