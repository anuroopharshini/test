package ReadWriteFileIO;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;



public class ReadGuru99ExcelFile {
	
	public Sheet readExceL(String filePath,String filename,String SheetName)throws IOException
	
	
	{
		String s=filePath;
		File f=new File(s);
		FileInputStream input=new FileInputStream(f);
		Workbook workbook=null;
		String fileextension=filename.substring(filename.indexOf("."));
		if(fileextension.contains(".xlsx")){
			workbook=new XSSFWorkbook(input);
		}
		else if(fileextension.contains(".xls")){
			workbook=new HSSFWorkbook(input);
		}
		Sheet guru99Sheet=workbook.getSheet(SheetName);
		return guru99Sheet;
	}

}
