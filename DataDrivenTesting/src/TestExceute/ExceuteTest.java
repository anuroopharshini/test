package TestExceute;
import org.testng.annotations.Test;
import ReadWriteFileIO.ReadGuru99ExcelFile;
import Operation.ReadObject;
import Operation.UIOperation;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.util.Properties;

public class ExceuteTest {
	//ReadGuru99ExcelFile r=new ReadGuru99ExcelFile();
	WebDriver w;
	UIOperation u;
	ReadObject read=new ReadObject();
	
	//Sheet sheet=r.readExceL("DataDriven.xlsx"," C:\\Users\\andym\\workspace\\DataDriven.xlsx", "TestSheet");
	
	
	@Test
	public void execute() throws IOException,Exception
	{
		//ReadObject read;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andym\\workspace\\chromedriver_win32\\chromedriver.exe");
		w=new ChromeDriver();
		
		//w.manage().window().maximize();
		w.manage().deleteAllCookies();
		ReadGuru99ExcelFile r=new ReadGuru99ExcelFile();
		u=new UIOperation(w);
		
		Sheet sheet=r.readExceL("C:\\Users\\andym\\workspace\\DataDriven.xlsx","DataDriven.xlsx","TestSheet");
		Properties p=new Properties();
		p=read.getObjectRepository();;
		int rowcount=sheet.getLastRowNum();
		
			
						for(int i=1;i<=rowcount;i++){
							Row r1=sheet.getRow(i);
							//System.out.println(r.getLastCellNum());
							/*if(r.getCell(1).toString().length()!=0){
								//if(r.getCell(j).getStringCellValue().equals("")){
								//	System.out.print("");
								//}
							Cell c=r.getCell(2);
							System.out.println(c.getStringCellValue());
								
							}
							else{
								System.out.println("New Testcase->"+r.getCell(0).toString() +" Started");
							}*/
							String s1="";
							String s2="";
							String s3="";
							String s4="";
								if(r1.getCell(0)==null){
							
								
								if(r1.getCell(1)==null){
									s1=" ";
								}
								else{
									s1=r1.getCell(1).toString();
								}
														
								if (r1.getCell(2)==null){
								
									s2="";
								}
								else{

									s2=r1.getCell(2).toString();
								}
							
								if(r1.getCell(3)==null){
									s3=" ";
								}
								else{
									s3=r1.getCell(3).toString();
								}
														
								if(r1.getCell(4)==null){
								
									s4="";
								}
								else{
									s4=r1.getCell(4).toString();
								}
							
								
								System.out.print(s1+""+s2+""+s3+""+s4);
								
								u.perform(p,s1,s2,s3,s4);
							}
								
								//u.perform(p,s1,s1,s1,s1);
										//r1.getCell(j).toString());
							
							System.out.println("");
						}
						}
			
		}
		
		
	

	
	
	
	


