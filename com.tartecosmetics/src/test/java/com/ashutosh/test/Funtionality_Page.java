package com.ashutosh.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Funtionality_Page {
	
	public  WebDriver driver;
	
	public Funtionality_Page(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li/a[contains(text(),'new arrivals')]")
	WebElement navi;
	
	
	@FindBy(xpath="//a[@title='View Bag & Check Out']")
	WebElement bag;
	
//	public void offerPageHandle() {
//		
//		try {
//			driver.findElement(By.xpath("/div/button[contains(text(),\"I'LL PAY FULL PRICE\")]")).click();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
		
	public void naviCategory() {
		
		try {
			driver.findElement(By.xpath("//div[@id='bx-element-1146662-hOQ6Kzo']")).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		navi.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addProducts() {
		
	    		
        WebElement ele=	driver.findElement(By.xpath("//a[@title='Go to Product: no mirror must-haves color collection']"));
        		
       	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
        		
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		
		navi.click();
		
		try {
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement ele2 = driver.findElement(By.xpath("//a[@title=\"Go to Product: live, love, clay eye set\"]"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()", ele2);
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		
		navi.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement ele3 = driver.findElement(By.xpath("//a[@title=\"Go to Product: knockout pore refining set\"]"));
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("arguments[0].click()", ele3);
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
	
	}
	
	public void goToBag() {
		
		bag.click();
	}
	public void removeAnItem(String productName) {
		
		List<WebElement> noOfItemsInBag = driver.findElements(By.xpath("//*[@id='cart-table']/tbody/tr"));
		System.out.println("Total number of items in bag before removal: "+noOfItemsInBag.size());
		
		for(WebElement ele : noOfItemsInBag) {
			
			WebElement product = ele.findElement(By.xpath("./td//a/span[1]"));
			if(productName.equalsIgnoreCase(product.getText())) {
				
				WebElement remove = ele.findElement(By.xpath(".//ancestor::tbody/tr/td[@class='remove']/button"));
				remove.click();
				break;
			}
		}
	}
	
	public void verifyItemRemoved() {
		
		List<WebElement> noOfItemsInBag = driver.findElements(By.xpath("//*[@id='cart-table']/tbody/tr"));
		System.out.println("Total number of items in bag after removal: "+noOfItemsInBag.size());
		
		
WebElement imageFile =  driver.findElement(By.xpath("//td/img[@title='live, love, clay eye set']"));
		
		Boolean imagePresent = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth!=\"undefined\" && arguments[0].naturalWidth>0", imageFile);
		if(!imagePresent) {
			System.out.println("Image is not present");
		}else {
			System.out.println("Image is present");
		}
	}

	

}
