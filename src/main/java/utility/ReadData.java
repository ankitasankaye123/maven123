package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{

	static XSSFWorkbook workbook;
	public static void main(String[] args) throws IOException
    {
		
    	FileInputStream file = new FileInputStream("E:\\contactData.xlsx");
    	XSSFWorkbook workbook = new XSSFWorkbook(file);
		
    	XSSFSheet sheet= workbook.getSheet("ContactData");
    	int rows = sheet.getLastRowNum();
    	System.out.println(rows);
    	
    	
    	
    	//return data;
    	
    			
	}
}
