package AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowserworking {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jakia Ferdous\\eclipse-workspace\\projectSelenium\\src\\Drivers\\chromedriver.exe");

 driver= new ChromeDriver();
driver.navigate().to("https://www.amazon.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
// how could we window handle Console:CDwindow-E9B5C6AF21B0C5AF8B71EE78739BF5F8shown on the console every execution time it will be changing
 String windowhandle=driver.getWindowHandle();
 System.out.println(windowhandle);
 // what is the current Url  This is my current url:https://www.amazon.com/ shown on the console
 String urlOfBrowser=driver.getCurrentUrl();
 System.out.println(urlOfBrowser);
 driver.close();

}
}