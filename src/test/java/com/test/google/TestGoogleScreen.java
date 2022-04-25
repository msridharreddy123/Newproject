package com.test.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogleScreen {
	public static void main(String args[]) throws InterruptedException {
		String name="Neerajakshulu Allala";
		// private static WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\chromeexe\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com/");
		if(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed()) {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(name);
		}
		/*if(driver.findElement(By.xpath("//button[@aria-label='No thanks']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		}*/
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//input[@name='q']")).isDisplayed()) {
			driver.findElement(By.xpath("//input[@name='q']")).submit();
		}
		
		
		driver.findElement(By.linkText("Neerajakshulu Allala - SDET - Oracle | LinkedIn")).click();
		boolean city = driver.getPageSource().contains("Concord");
		if(city) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIL");
		}
		String Expected=driver.findElement(By.xpath("//div/h1[@class='text-heading-xlarge inline t-24 v-align-middle break-words']")).getText();
		if(name.equals(Expected)) {
			System.out.println("Name matches");
		}
		else {
			System.out.println("Name doesnt matches");
			
		}
	}

	

}
