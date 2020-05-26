package KDframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelComm {
	
	
	public HashMap<Integer,ArrayList<String>> readexcel(String SheetName) throws IOException
	{
		HashMap<Integer,ArrayList<String>> Map = new HashMap<Integer,ArrayList<String>>();
		
		File file = new File("C:\\Users\\my\\Desktop\\datatest.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet Sheet = workbook.getSheet(SheetName);
		
		for(int i =0;i<=Sheet.getLastRowNum();i++){
		ArrayList<String> list = new ArrayList<String>();
		HSSFRow Row = Sheet.getRow(i);
		for(int j=0;j<Row.getLastCellNum();j++)
		{
			
			HSSFCell Cell = Row.getCell(j);
			list.add(Cell.getStringCellValue());
			
		}
		Map.put(i, list);
		
	}
		return Map;

}
	public void WriteExcel(int rowno,String Result,String SheetName) throws IOException
	{
		File file = new File("C:\\Users\\my\\Desktop\\datatest.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet(SheetName);
		

			HSSFRow row = sheet.getRow(rowno);
			HSSFCell Cell = row.createCell(4);
			Cell.setCellValue(Result);
			FileOutputStream outstream = new FileOutputStream(file);
			workbook.write(outstream);
		
		
	}
	
	public ArrayList<String> SheetName() throws IOException
	{
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("C:\\Users\\my\\Desktop\\datatest.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		
	for(int i=0;i<workbook.getNumberOfSheets();i++)
	{
		
		list.add(workbook.getSheetName(i));
	}
	return list;
	}
	
	
}
