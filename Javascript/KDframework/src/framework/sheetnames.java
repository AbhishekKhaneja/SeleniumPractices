package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.xerces.util.SynchronizedSymbolTable;

public class sheetnames {

	public ArrayList<String> sheetname() throws Exception {

		ArrayList<String> list = new ArrayList();
		// List<String> list = new List<String>();
		File file = new File("C:\\Users\\my\\Desktop\\Testcases.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		for (int i = 0; i < workbook.getNumberOfSheets(); i++)
		{
			list.add(workbook.getSheetName(i));
		System.out.println(list);
		}
		return list;
	}

}
