package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-infobars");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(5000);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
