package com.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("MOhan");
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mohanssingh84@gmail.com");
		driver.findElement(By.cssSelector("*[id=\"pass\"]")).sendKeys("IPL2015@aa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.setProperty("webdriver.ie.driver", "C:\\Users\\MOHAN\\Desktop\\Drivers\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.navigate().to("https://www.facebook.com/");
		
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("mohanssingh84@gmail.com");
		driver1.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("IPL2015@aa");
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
