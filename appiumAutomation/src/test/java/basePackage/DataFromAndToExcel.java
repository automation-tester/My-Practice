package basePackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromAndToExcel {
	
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	
	public static String readDataFromExcel(String Excel,String sheet,int row, int cell) throws IOException{
		
		fis=new FileInputStream(Excel);
		
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet(sheet);
		String value= sh.getRow(row).getCell(cell).getStringCellValue();	
		fis.close();
		return value;
	}
	
	public static void writeDataIntoExcel(String Excel,String sheet,int row, int cell) throws IOException{
		
		fis=new FileInputStream(Excel);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet(sheet);
		sh.getRow(row).getCell(cell).setCellValue("");
	}
	
	
	

}
