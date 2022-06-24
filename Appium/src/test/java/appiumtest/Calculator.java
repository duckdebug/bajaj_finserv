package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Calculator {
	
	static AppiumDriver<MobileElement> driver;
	
	
	public static void main(String[] args) {
		try {
			oCalculator();
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}

		
	}
	public static void oCalculator() throws Exception {
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Mi A3");
		cap.setCapability("udid", "b3870b140952");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		

		System.out.println("started......");
		
		
		
	}

}

