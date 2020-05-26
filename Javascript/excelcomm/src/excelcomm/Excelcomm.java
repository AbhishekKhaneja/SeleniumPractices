package excelcomm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelcomm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\my\\Desktop\\test.xls");
		FileInputStream stream = new FileInputStream(file);// putting up a lock
															// on it
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");

	//	System.out.println(sheet.getLastRowNum());
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			
			HSSFRow rows = sheet.getRow(i);
			for (int j = 0; j < rows.getLastCellNum(); j++) {
				HSSFCell cell = rows.getCell(j);
				System.out.print(cell.getStringCellValue()+" ");

			}
			System.out.println();

		}

	}
}
