package org.cts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement inp = driver.findElement(By.id("inputValEnter"));
		inp.sendKeys("headset");
		
		WebElement btn = driver.findElement(By.xpath("//span[text()='Search']"));
		btn.click();
		
		WebElement btn1 = driver.findElement(By.xpath("//p[text()='SBS HBS730 Wireless Bluetooth Headphone Black']"));
		btn1.click();
		
		String s= driver.getWindowHandle();
		
		Set<String> a= driver.getWindowHandles();
		
		for (String i : a) {
			if (!i.equals(s)) {
				driver.switchTo().window(i);
				
				
			}
			
			
		}
		WebElement btn2 = driver.findElement(By.xpath("//span[text()='add to cart']"));
		btn2.click();
		
	
	}
}

