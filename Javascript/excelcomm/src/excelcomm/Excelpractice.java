package excelcomm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Excelpractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("C:\\Users\\my\\Desktop\\testy.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
	HSSFSheet Sheet = 	workbook.getSheet("Sheet1");
	HSSFRow Row = null;
	HSSFCell cell= null;
	for(int i =0;i<=Sheet.getLastRowNum();i++)
	{
	    Row=Sheet.getRow(i);
		for(int j =0;j<Row.getLastCellNum();j++)
		{
		 cell = Row.getCell(j);
			list.add(cell.getStringCellValue());
		}
	}
	
	
	for(int h =0;h<list.size();h++)
	{
	//	System.out.println("inside");
		Sheet = workbook.getSheet("Sheet2");
		Row = Sheet.createRow(h);
		for(int m =0;m<1;m++)
			
		{
		//	System.out.println("inside m");
			cell =Row.createCell(m);
			cell.setCellValue(list.get(h));
			
		}
		FileOutputStream Stream2 = new FileOutputStream(file);
		workbook.write(Stream2);
	}
		
		

	}

}
