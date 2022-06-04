package baiscjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//Driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-web-security");
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
//		driver.findElement(By.id("username")).sendKeys("9815544117");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='modalFieldInner makeFlex hrtlCenter ']")).sendKeys("271647");
//		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("Chandigarh");
		driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys("Pune");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[2]/div[1]/p[1]")).click();
		driver.findElement(By.linkText("Search")).click();
		
	}

}
