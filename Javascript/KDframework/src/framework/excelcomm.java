package framework;

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

public class excelcomm {

	public HashMap<Integer, ArrayList<String>> readExcel(String SheetName) throws IOException {
		File file = new File("C:\\Users\\my\\Desktop\\Testcases.xls");
		FileInputStream stream = new FileInputStream(file);// It will put a lock
															// on the thread and
															// data that is
															// there is excel
															// will be in a
															// buffer memory
															// which has a
															// advatange of
															// memory
															// utilisation
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet(SheetName);
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			ArrayList<String> List = new ArrayList<String>();
			HSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				HSSFCell cell = row.getCell(j);
				List.add(cell.getStringCellValue());
			}
			map.put(i, List);
		}
		return (map);
	}

	public void WriteExcel(int rowno, String result, String SheetName) throws IOException {
		File file = new File("C:\\Users\\my\\Desktop\\Testcases.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet(SheetName);

		HSSFRow row = sheet.getRow(rowno);
		HSSFCell Cell = row.createCell(4);
		Cell.setCellValue(result);
		FileOutputStream outstream = new FileOutputStream(file);
		workbook.write(outstream);

	}

	public ArrayList<String> sheetname() throws Exception {

		ArrayList<String> list = new ArrayList();
		// List<String> list = new List<String>();
		File file = new File("C:\\Users\\my\\Desktop\\Testcases.xls");
		FileInputStream stream = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			list.add(workbook.getSheetName(i));
			System.out.println(list);
		}
		return list;
	}
}
