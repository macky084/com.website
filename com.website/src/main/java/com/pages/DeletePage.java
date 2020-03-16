package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DeletePage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\IEDriverServer.exe");
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.get("https://www.seleniumeasy.com/test/");
		driver3.findElement(By.xpath("//a[@id=\"btn_basic_example\"]")).click();
		driver3.findElement(By.xpath("//*[@id=\"basic\"]/div/a[1]")).click();
		driver3.findElement(By.xpath("//input[@id=\"user-message\"]")).sendKeys("MOhan Singh");
		driver3.findElement(By.xpath("//*[@id=\"user-message\"]/label")).click();
		 driver3.close();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.get("https://www.seleniumeasy.com/test/");
		driver2.findElement(By.xpath("//a[@id=\"btn_basic_example\"]")).click();
		driver2.findElement(By.xpath("//*[@id=\"basic\"]/div/a[1]")).click();
		driver2.findElement(By.xpath("//input[@id=\"user-message\"]")).sendKeys("MOhan Singh");
		driver2.findElement(By.xpath("//*[@id=\"user-message\"]/label")).click();

		driver2.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/");
		driver.findElement(By.xpath("//a[@id=\"btn_basic_example\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"basic\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//input[@id=\"user-message\"]")).sendKeys("MOhan Singh");
		driver.findElement(By.xpath("//*[@id=\"user-message\"]/label")).click();
		
		driver.close();
		
}
}