package Operation;
import java.util.Properties;
import java.io.*;

public class ReadObject

{
	Properties p=new Properties();;
	
	public Properties getObjectRepository()throws IOException
	{
		File f=new File("C:\\Users\\andym\\workspace\\DataDrivenTesting\\src\\Operation\\object.properties");
		FileInputStream f2=new FileInputStream(f);
		p.load(f2);
		//p.getProperty("url");
		return p;
		
		
	}

}
