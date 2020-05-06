package Operation;
import org.openqa.selenium.WebDriver;
import java.util.Properties;
import org.openqa.selenium.By;

public class UIOperation {
	
	WebDriver w;
	public UIOperation(WebDriver w){
		
		this.w=w;
	}
	
	public void perform(Properties p,String Keyword,String Object,String ObjectType,String value)
	throws Exception{
		
		switch(Keyword.toUpperCase()){
		
		case "GOTOURL":w.get(p.getProperty(value));
		break;
		case "SETTEXT": w.findElement(this.getObject(p,Object,ObjectType)).sendKeys(value);
		break;
		case "CLICK": w.findElement(this.getObject(p,Object,ObjectType)).click();
		break;
		default:
		
		
		}
	}
		
		 By getObject(Properties p,String Object,String ObjectType) throws Exception{
			
			if(ObjectType.equalsIgnoreCase("name")){
				
				return By.name(p.getProperty(Object));
			}
			
			else if(ObjectType.equalsIgnoreCase("xpath")){
				
				return By.xpath(p.getProperty(Object));
			}
else if(ObjectType.equalsIgnoreCase("css")){
				
				return By.cssSelector(p.getProperty(Object));
}
				else{
					
					throw new Exception("nothing has matched");
				}
			
			
			
		}
		
		
		
	}
	


