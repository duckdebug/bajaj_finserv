package baiscjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Selenium//Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		navigate to the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
//		verify url
		String desired_url ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(act_url.equals(desired_url)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		String title=driver.getTitle();
		System.out.println(title);
		String desired_title="OrangeHRM\\";
		if(title.equals(desired_title)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
