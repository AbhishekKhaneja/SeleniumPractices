package excelcomm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\my\\Desktop\\test.xls");
		FileInputStream stream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet Sheet = workbook.getSheet("Sheet1");
		
//		for(int i =0;i<=Sheet.getLastRowNum();i++)
//		{
			HSSFRow Rows ;
					System.out.println(Sheet.getRow(2).getCell(1).getStringCellValue());
		//	System.out.println(Sheet.getRow(2));
//			for(int j=0;j<Rows.getLastCellNum();j++)
//			{	
				//HSSFCell cell = Rows.getCell(0);
				//System.out.println(cell.getNumericCellValue());
			}
	

	}

