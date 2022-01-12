package com.bridgelabz.main;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\OneDrive\\Desktop\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Logger log = Logger.getLogger(App.class);
	        PropertyConfigurator.configure("C:\\Users\\asus\\eclipse-workspace\\SeleniumLog4J\\src\\main\\java\\com\\bridgelabz\\seleniumLogs\\Log4J.properties");
	        driver.get("https://www.facebook.com/");
	        log.debug("Browser will be launched");
	        log.info("Error");

	}

}
