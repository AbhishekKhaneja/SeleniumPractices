package framework;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class Execution {

	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// String sheetName = null;
	@Test
	public void method1() throws Exception
	{
		excelcomm obj = new excelcomm();
		ArrayList<String> L = obj.sheetname();
		for (int j = 0; j < L.size(); j++) {
			String SheetName = L.get(j);
			HashMap<Integer, ArrayList<String>> tempmap = obj.readExcel(SheetName);
            System.out.println("map="+tempmap);
			for (int i = 0; i < tempmap.size(); i++) {
				ArrayList<String> templist = tempmap.get(i);
				System.out.println("templist="+templist);
				KeywordLibrary.RuntimeController(templist.get(0), templist.get(1), templist.get(2), templist.get(3));

				obj.WriteExcel(i, KeywordLibrary.Status, SheetName);
			}
		}
	}
}

			// KeywordLibrary.RuntimeController("openBrowser","chrome","http://newtours.demoaut.com/","skip");
			// KeywordLibrary.RuntimeController("Entertext", "name", "userName",
			// "batman");
			// KeywordLibrary.RuntimeController("Entertext", "name", "password",
			// "batman");
			// KeywordLibrary.RuntimeController("Button","name","login","skip");
			//

			// KeywordLibrary.openBrowser("chrome", "", P3);
			// KeywordLibrary.Entertext("name", "userName", "batman");
		


	

