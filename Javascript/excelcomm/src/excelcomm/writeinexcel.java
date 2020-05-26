package excelcomm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class writeinexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Users\\my\\Desktop\\test.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("sorting");
		HSSFRow rows =null;
		HSSFCell cell =null;
	}

}
