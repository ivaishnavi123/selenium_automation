package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vaishnavi Patil\\eclipse-workspace\\selenium_automation\\all_necessary_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Vaishnavi Patil\\eclipse-workspace\\selenium_automation\\all_necessary_files\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Vaishnavi Patil\\eclipse-workspace\\selenium_automation\\all_necessary_files\\IEDDriver.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Vaishnavi Patil\\eclipse-workspace\\selenium_automation\\all_necessary_files\\msedgeDriver.exe");
		WebDriver driver4 = new EdgeDriver();
		
		WebDriver driver3 = new SafariDriver();
	}

}
