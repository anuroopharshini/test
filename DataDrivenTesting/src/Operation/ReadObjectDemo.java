package Operation;
import java.util.Properties;
import java.io.*;

public class ReadObjectDemo {
	public static void main(String[] args)throws IOException
	{
		ReadObject ro=new ReadObject();
		Properties p=ro.getObjectRepository();
		System.out.println(p.getProperty("username"));
		
		
		
	}

}
