package src.com.amazon.generic;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getdata(String sheet, int row, int col) 
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File("./Data/input.xlsx"));
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(col);
			String data = c.getStringCellValue();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}
		
	}
}
