package baiscjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		max the chrome browser
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get("https://www.bajajfinservhealth.in/");
		
		//TagName
		List<WebElement> lnk =driver.findElements(By.tagName("a"));
		System.out.println(lnk.size());
		
		// name of the links
		for(WebElement l:lnk) {
			System.out.println(l.getText());
		}
	}

}