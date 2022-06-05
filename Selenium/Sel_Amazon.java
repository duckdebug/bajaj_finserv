package baiscjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sel_Amazon {
	// Function creates web element 
	public static WebElement createWebElement(String selector, WebDriver driver) {
		WebElement ele = driver.findElement(By.cssSelector(selector));
		return ele;
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions actions = new Actions(driver);
		actions.moveToElement(createWebElement("#nav-link-accountList-nav-line-1", driver));
		actions.moveToElement(createWebElement("#nav-flyout-ya-signin > a > span", driver));
		actions.click().build().perform();
		//max the chrome browser
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("rememberMe")).click();
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone 12");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Blue")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']//span[@class='a-button-inner']")).click();
		
		
	}	
}
