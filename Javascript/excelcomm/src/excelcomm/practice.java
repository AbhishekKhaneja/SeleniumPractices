package excelcomm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Double> list = new ArrayList<Double>();
	
		
		File file = new File("C:\\Users\\my\\Desktop\\test.xls");
		FileInputStream Stream = new FileInputStream(file);  
		
        HSSFWorkbook Workbook = new HSSFWorkbook(Stream);
     HSSFSheet sheet =  Workbook.getSheet("sorting");
    
     HSSFCell cell =null;
     HSSFRow Row=null;
    // System.out.println(sheet.getLastRowNum());
     for(int i =0 ;i<=sheet.getLastRowNum();i++)
     {
    	Row=sheet.getRow(i); 
    	 for(int j=0;j<Row.getLastCellNum();j++)
    	 {
    		  cell = Row.getCell(j);
    	//	 System.out.print(cell + " ");
    			list.add(cell.getNumericCellValue());
    			Collections.sort(list);
    		 //cell.getStringCellValue();
    	 }
    	 
     }
     System.out.println(list);
     
 	for(int h =0;h<list.size();h++)
 	{
 		sheet =  Workbook.getSheet("Sheet3");
 		Row = sheet.createRow(h);
    for(int m =0;m<1;m++)
    {
    	
    	cell= Row.createCell(m);
    	System.out.println("kitni baar andar aaya");
    	cell.setCellValue(list.get(h));
    }
	//Row=sheet.getRow(0);
//	cell=Row.getCell(0);
//	cell.setCellValue(3.0);
	FileOutputStream Stream2 = new FileOutputStream(file);
	Workbook.write(Stream2); 
	}

}
}
