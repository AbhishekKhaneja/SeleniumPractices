package excelcomm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excellistsort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		
		File file = new File("C:\\Users\\my\\Desktop\\test.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("sorting");
		HSSFRow rows =null;
		HSSFCell cell =null;
	for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			rows = sheet.getRow(i);
			System.out.println(rows.getLastCellNum());
			for (int j = 0; j < rows.getLastCellNum(); j++) {
				cell = rows.getCell(j);
		    list.add(cell.getNumericCellValue());
			    
                Collections.sort(list);
			}
			
	}
		
		
		System.out.println(list);

		
		rows = sheet.createRow(10);
			 
			for(int m=0;m<list.size();m++)
			{
				
			cell= rows.createCell(m);
			cell.setCellValue(list.get(m));
		}
		
		
		
		
//	rows = sheet.createRow(8);
//	cell= rows.createCell(0);
//	cell.setCellValue("test");
//	
	FileOutputStream stream2= new FileOutputStream(file);
	workbook.write(stream2);
	
	}	
}
