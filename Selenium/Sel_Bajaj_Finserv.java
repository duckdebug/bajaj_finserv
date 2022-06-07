package baiscjava;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Bajaj_Finserv {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Selenium/Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
//		To Maximize browser window
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Bajaj Finsev Health Limited"+Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Bajaj Finserv Health - Your Personalized Healthcare Platform')]")).click();
		driver.findElement(By.xpath("//input[@id='searchBarInput']")).sendKeys("Doctor"+Keys.ENTER);
//		Adding wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='css-apwxfg']//div//div[1]//a[1]//div[1]//div[4]//button[2]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[5]/div[1]/section[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/a[11]/button[1]/span[1]")).click();
		/*click details option not visible until user loggedin
		and login requires otp hence cann't proceed further
		*/
	}
}
