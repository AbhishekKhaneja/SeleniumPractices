package KDframework;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class executor {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ExcelComm obj = new ExcelComm();
		ArrayList<String> Sheetnames = obj.SheetName();
		for(int j=0;j<Sheetnames.size();j++)
		{
			HashMap<Integer,ArrayList<String>> Map = new HashMap<Integer,ArrayList<String>>();
		  
	      Map =	obj.readexcel(Sheetnames.get(j));
	      
	      for(int i =0;i<Map.size();i++)
	      {
	    	  ArrayList<String> listt = Map.get(i);
	      
          Controller.runtimeController(listt.get(0), listt.get(1) ,listt.get(2), listt.get(3));
          obj.WriteExcel(i,Controller.Status,Sheetnames.get(j));
	}
	}

}
} 
