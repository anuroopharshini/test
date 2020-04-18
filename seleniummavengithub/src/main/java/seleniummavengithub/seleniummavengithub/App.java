package seleniummavengithub.seleniummavengithub;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class App {
	WebDriver c;
	
	public void m1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andym\\workspace\\chromedriver_win32\\chromedriver.exe");
		c=new ChromeDriver();
		
		c.manage().window().maximize();
		c.manage().deleteAllCookies();
		c.get("https://www.google.com/");
		
		
		
	}
	

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        App a=new App();
        a.m1();
    }
}
