package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDetails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vaishnavi Patil\\eclipse-workspace\\selenium_automation\\all_necessary_files\\chromedriver.exe");
		//open the browser
		WebDriver driver = new ChromeDriver();
		//navigate to website
		driver.get("https://www.ecoders.in");
		//get the title
		 String titleofpage=driver.getTitle();
		 System.out.println(titleofpage);
		 Thread.sleep(1000);
		 //get the current url
		 String currenturl=driver.getCurrentUrl();
		 System.out.println(currenturl);
		 Thread.sleep(1000);
	     //To get page source
		 String pagesource =driver.getPageSource();
		 System.out.println(pagesource);
		 Thread.sleep(1000);
//		driver.navigate().to("https://ecoders.in");
	    Thread.sleep(5000);//keep browser open for upto that time
		driver.quit();//close the browser
	}

}
