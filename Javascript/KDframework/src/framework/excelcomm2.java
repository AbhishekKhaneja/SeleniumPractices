package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelcomm2 {

	public HashMap < Integer,ArrayList<String> > readexcel(String SheetName) throws IOException {
		File file = new File("C:\\Users\\my\\Desktop\\Test1.xls");

		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet(SheetName);

		HashMap < Integer,ArrayList<String> > map = new HashMap<Integer,ArrayList<String> >();
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			ArrayList<String> list = new ArrayList<String>();
			HSSFRow Rows = sheet.getRow(i);
			for (int j = 0; j <Rows.getLastCellNum(); j++) {
				HSSFCell cell = Rows.getCell(j);
				list.add(cell.getStringCellValue());
			//	System.out.println(list);
			}
			
         map.put(i, list);
		}
		return (map);

	}
}
